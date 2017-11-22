package com.gree.twms.controller.toolReview;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Review;
import com.gree.twms.service.IReviewService;
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
import javax.servlet.http.HttpServletResponse;


@Controller
public class ToolReviewController {

    @Autowired
    private IReviewService reviewService;
    
    @RequestMapping("/addToolReview")
    public String addToolReview(Review review, HttpServletRequest request){
        String msg="";

        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(request.getSession().getServletContext());

        //检查form中是否有enctype="multipart/form-data"
        if(multipartResolver.isMultipart(request)) {
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
                    String savePath="E:/twms/review/";
                    String filePath=savePath + multipartFile.getOriginalFilename();
                    File saveFileDir = new File(savePath);
                    if (!saveFileDir.exists()) {
                        //如果文件目录不存在，创建新目录
                        saveFileDir.mkdirs();
                    }else if(new File(filePath).exists()){
                        msg = "文件名为(" + multipartFile.getOriginalFilename() + ")的文件已经存在，请修改文件名后重新上传！";
                        break;
                    }
                    //上传
                    if(!multipartFile.isEmpty()){
                        try {
                            multipartFile.transferTo(new File(filePath));
                            //将文件存储信息插入到数据库
                            review.setEnclosureurl(savePath + multipartFile.getOriginalFilename());
                            if(reviewService.insertSelective(review)==1){
                                msg = "提交成功！";
                            }else {
                                msg = "提交失败！请重试";
                            }
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                            msg="上传失败！";
                            request.setAttribute("msg",msg);
                            return "tool-review";
                        }
                    }else {
                        if(reviewService.insertSelective(review)==1){
                            msg = "提交成功！";
                        }else {
                            msg = "提交失败！请重试";
                        }
                    }
                }
            }
        }else{
            if(reviewService.insertSelective(review)==1){
                msg = "提交成功！";
            }else {
                msg = "提交失败！请重试";
            }
        }
        request.setAttribute("msg",msg);
        return "tool-review";
    }

    //单个删除
    @RequestMapping("/deleteReview")
    public String deleteReview(HttpServletRequest request,Integer id){
        String msg = "";
        if(id!=null){
            Review review = reviewService.selectByPrimaryKey(id);
            if(review.getEnclosureurl() != null){
                String filePath = review.getEnclosureurl();
                if(reviewService.deleteByPrimaryKey(id) == 1){
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
                if(reviewService.deleteByPrimaryKey(id) == 1){
                    msg = "删除成功！";
                }else {
                    msg ="删除失败！";
                }
            }
        }
        return searchReview(request,null,null,null,msg);
    }

    //批量删除
    @ResponseBody
    @RequestMapping("/delCheckedReview")
    public  Map<Object,Object> delCheckedReview(int[] checkID){
        String msg = "";
        Map<Object,Object> resultMap=new HashMap<Object,Object>();
        int success = 0;
        int fail = 0;
        if(checkID!=null) {
            for (int i = 0; i < checkID.length; i++) {
                Review review = reviewService.selectByPrimaryKey(checkID[i]);
                if(review.getEnclosureurl() != null){
                    String filePath = review.getEnclosureurl();
                    if(reviewService.deleteByPrimaryKey(checkID[i]) == 1){
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
                    if(reviewService.deleteByPrimaryKey(checkID[i]) == 1){
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
    @RequestMapping("/searchReview")
    public String searchReview(HttpServletRequest request, String conditions, String keywords,Integer pageNum,String msg){
        PageInfo<Review> pageInfo=reviewService.conditionQueryPage(pageNum,conditions,keywords );
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("reviews",pageInfo.getList());
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
        return "review-account";
    }

    //附件下载
    @RequestMapping("/downFile")
    public void downFile(String filePath,HttpServletRequest request,  HttpServletResponse response) {
        FileOperations.downFile(filePath, response,request);
    }
}
