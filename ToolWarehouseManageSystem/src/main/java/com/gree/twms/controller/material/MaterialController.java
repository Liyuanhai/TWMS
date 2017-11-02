package com.gree.twms.controller.material;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Material;
import com.gree.twms.service.IMaterialService;
import com.gree.twms.tool.FileOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/twms")
@Controller
public class MaterialController {
    
    @Autowired
    private IMaterialService materialService;

    @RequestMapping("/addMaterial")
    public String addToolMaterial(Material material, HttpServletRequest request){
        String msg="";

        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(request.getSession().getServletContext());

        //检查form中是否有enctype="multipart/form-data"
        if(multipartResolver.isMultipart(request))
        {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;

            //获取multiRequest 中所有的文件名
            Iterator<String> iter=multiRequest.getFileNames();

            while(iter.hasNext())
            {
                //一次遍历所有文件
                MultipartFile multipartFile=multiRequest.getFile(iter.next().toString());
                if(multipartFile!=null)
                {
                    String savePath=request.getSession().getServletContext().getRealPath("/") + "material/";
                    File saveFileDir = new File(savePath);
                    if (!saveFileDir.exists()) {
                        //如果文件目录不存在，创建新目录
                        saveFileDir.mkdirs();
                    }
                    //上传
                    if(!multipartFile.isEmpty()){
                        try {
                            multipartFile.transferTo(new File(savePath + multipartFile.getOriginalFilename()));
                            //将文件存储信息插入到数据库
                            material.setEnclosureurl(savePath + multipartFile.getOriginalFilename());
                            if(materialService.insertSelective(material)==1){
                                msg = "提交成功！";
                            }else {
                                msg = "提交失败！请重试";
                            }
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                            msg="上传失败！";
                            request.setAttribute("msg",msg);
                            return "material-info";
                        }
                    }else {
                        if(materialService.insertSelective(material)==1){
                            msg = "提交成功！";
                        }else {
                            msg = "提交失败！请重试";
                        }
                    }
                }
            }
        }else{
            if(materialService.insertSelective(material)==1){
                msg = "提交成功！";
            }else {
                msg = "提交失败！请重试";
            }
        }
        request.setAttribute("msg",msg);
        return "material-info";
    }

    //单个删除
    @RequestMapping("/deleteMaterial")
    public String deleteMaterial(HttpServletRequest request,Integer id){
        String msg = "";
        if(id!=null){
            Material material = materialService.selectByPrimaryKey(id);
            if(material.getEnclosureurl() != null){
                String filePath = material.getEnclosureurl();
                if(materialService.deleteByPrimaryKey(id) == 1){
                    if(FileOperations.delFile(filePath) == -1) {
                        msg = "删除成功！该记录文件不存在或已被删除！";
                    }else if(FileOperations.delFile(filePath) == 0){
                        msg = "删除失败！";
                    }else {
                        msg = "删除成功！";
                    }
                }else {
                    msg ="删除失败！";
                }
            }else {
                if(materialService.deleteByPrimaryKey(id) == 1){
                    msg = "删除成功！";
                }else {
                    msg ="删除失败！";
                }
            }
        }
        return searchMaterial(request,null,null,null,msg);
    }

    //批量删除
    @ResponseBody
    @RequestMapping("/delCheckedMaterial")
    public Map<Object,Object> delCheckedMaterial(int[] checkID){
        String msg = "";
        Map<Object,Object> resultMap=new HashMap<Object,Object>();
        int success = 0;
        int fail = 0;
        if(checkID!=null) {
            for (int i = 0; i < checkID.length; i++) {
                Material material = materialService.selectByPrimaryKey(checkID[i]);
                if(material.getEnclosureurl() != null){
                    String filePath = material.getEnclosureurl();
                    if(materialService.deleteByPrimaryKey(checkID[i]) == 1){
                        if(FileOperations.delFile(filePath) == -1) {
                            success++;
                        }else if(FileOperations.delFile(filePath) == 0){
                            success++;
                        }else {
                            success++;
                        }
                    }else {
                        fail++;
                    }
                }else {
                    if(materialService.deleteByPrimaryKey(checkID[i]) == 1){
                        success++;
                    }else {
                        fail++;
                    }
                }
            }
        }
        msg="成功删除" + success + "条记录，失败" + fail + "条记录！";
        resultMap.put("success",true);
        resultMap.put("msg",msg);
        return resultMap;
    }
    //查询
    @RequestMapping("/searchMaterial")
    public String searchMaterial(HttpServletRequest request, String conditions, String keywords, Integer pageNum, String msg){
        PageInfo<Material> pageInfo=materialService.conditionQueryPage(pageNum,conditions,keywords );
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("materials",pageInfo.getList());
        request.setAttribute("conditions",conditions);
        request.setAttribute("keywords",keywords);
        if(pageInfo.getList().isEmpty()){
            if(msg==null){
                msg = "没有查询到数据！";
            }else{
                msg +="\\n没有查询到数据！";
            }

        }
        request.setAttribute("msg",msg);
        return "material-account";
    }
}
