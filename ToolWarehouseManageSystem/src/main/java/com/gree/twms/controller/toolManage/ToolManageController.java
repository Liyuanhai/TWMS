package com.gree.twms.controller.toolManage;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Tool;
import com.gree.twms.pojo.User;
import com.gree.twms.service.IToolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@RequestMapping("/twms")
@Controller
public class ToolManageController {

    @Autowired
    private IToolService toolService;

    //插入单个工装信息
    @RequestMapping("/addTool")
    public String addTool(Tool tool, HttpServletRequest request){
        String msg="";
        if(toolService.countByPid(tool.getTid()) == 0){
            if(toolService.insertSelective(tool)==1){
                msg = "添加工装成功！";
            }else {
                msg = "添加工装失败！";
            }
        }else {
            msg += "工装编号为:" + tool.getTid() +"的工装已经存在!\\n";
        }
        return searchTool(request,null,null,null,msg);
    }

    //导入工装信息
    @RequestMapping("/importTools")
    public String importTools(HttpServletRequest request, MultipartFile file){
        Tool tool = new Tool();
        String msg = "";
        int result = 0;
        if(file == null){
            msg = "请选择要上传的文件！";
        }else if(file.getOriginalFilename().endsWith(".xlsx")){
            msg = "系统不支持excel-2007（以.xlsx结尾的文件)格式，请使用excel 97-2003（以.xls结尾的文件）";
            request.setAttribute("msg",msg);
            System.out.println(msg);
        }else if(file.getOriginalFilename().endsWith(".xls")) {
            try {
                //也可以用request获取上传文件
                //MultipartFile  fileFile = request.getFile("file"); //这里是页面的name属性
                //转换成输入流
                InputStream is = file.getInputStream();
                //得到excel
                Workbook workbook = Workbook.getWorkbook(is);
                //得到sheet
                Sheet sheet = workbook.getSheet(0);
                //得到列数
                int colsNum = sheet.getColumns();
                //得到行数
                int rowsNum = sheet.getRows();
                //单元格
                Cell cell;
                Map<Integer, String> map = new HashMap<Integer, String>();
                for (int i = 1; i < rowsNum; i++) {//第一行是标题,所以 i从1开始
                    for (int j = 0; j < colsNum; j++) {
                        cell = sheet.getCell(j, i);//第一个参数是列.第二个参数是行
                        map.put(j, cell.getContents());
                    }

                    tool.setTid(map.get(0));
                    tool.setTname(map.get(1));
                    tool.setTmodel(map.get(2));
                    tool.setVersionnum(map.get(3));
                    tool.setCompatibility(map.get(4));
                    tool.setMaketime(map.get(5));

                    try {
                        if(toolService.countByPid(tool.getTid()) == 0){
                            result += toolService.insertSelective(tool);
                        }else {
                            msg += "工装编号为:" + tool.getTid() +"的工装已经存在!\\n";
                            continue;
                        }
                    } catch (Exception e) {
                        msg = "数据库插入异常！";
                        System.out.println(msg);
                        return searchTool(request,null,null,null,msg);
                    }
                }

                msg += "成功导入" + result + "条信息，失败" + (rowsNum - result - 1) + "条!";

            } catch (IOException e) {
                e.printStackTrace();
            } catch (BiffException e) {
                e.printStackTrace();
            }
        }
        return searchTool(request,null,null,null,msg);
    }

    //单个删除工装信息
    @RequestMapping("/deleteTool")
    public String deleteTool(HttpServletRequest request){
        String tid = request.getParameter("tID");
        String msg = "";
        if(!tid.equals("")){
            int result = toolService.deleteByPrimaryKey(tid);
            if(result == 1){
                msg = "删除成功！";
            }else {
                msg ="删除失败！";
            }
        }
        return searchTool(request,null,null,null,msg);
    }

    //批量删除工装
    @ResponseBody
    @RequestMapping("/delCheckedTool")
    public  Map<Object,Object> delCheckedTool(String[] checkID){
        String msg = "";
        Map<Object,Object> resultMap=new HashMap<Object,Object>();
        int success = 0;
        int fail = 0;
        if(checkID!=null) {
            for (int i = 0; i < checkID.length; i++) {

                if (toolService.deleteByPrimaryKey(checkID[i]) == 1) {
                    success++;
                } else {
                    fail++;
                }
            }
        }
        msg="成功删除" + success + "条记录，失败" + fail + "条记录！";
        resultMap.put("success",true);
        resultMap.put("msg",msg);
        return resultMap;
    }
    //查询工装
    @RequestMapping("/searchTool")
    public String searchTool(HttpServletRequest request, String conditions, String keywords,Integer pageNum,String msg){
        PageInfo<Tool> pageInfo=toolService.conditionQueryPage(pageNum,conditions,keywords );
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("tools",pageInfo.getList());
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
        return "tool-manage";
    }

    //
    @RequestMapping("/editTool")
    public String editTool(HttpServletRequest request,Tool Tool){
        String msg="";
        User loginUser = (User) request.getSession().getAttribute("userInfo");
        if(loginUser.getRoleid()==1){
            if(toolService.updateByPid(Tool)==1){
                msg="修改成功！";
            }else{
                msg="修改失败！";
            }
        }else{
            msg = "您的管理权限不够，请与管理员联系！";
        }
        return searchTool(request,null,null,null,msg);
    }
}
