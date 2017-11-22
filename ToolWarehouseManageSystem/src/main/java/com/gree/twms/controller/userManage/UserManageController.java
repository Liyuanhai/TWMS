package com.gree.twms.controller.userManage;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.User;
import com.gree.twms.service.IUserService;

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

@Controller
public class UserManageController {

    @Autowired
    private IUserService userService;

    //插入单个用户信息
    @RequestMapping("/insertUser")
    public String insertUser(User user,HttpServletRequest request){
        String msg="";
        if(userService.countByPid(user.getPid()) == 0){
            if(userService.insertSelective(user)==1){
                msg = "添加用户成功！";
            }else {
                msg = "添加用户失败！";
            }
        }else {
            msg += "员工编号为:" + user.getPid() +"的用户已经存在!\\n";
        }
        return searchUser(request,null,null,null,msg);
    }

    //导入用户信息
    @RequestMapping("/importUsers")
    public String importUsers(HttpServletRequest request, MultipartFile file){
        User user = new User();
        String msg = "";
        int result = 0;
        if(file.getOriginalFilename().endsWith(".xlsx")){
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

                    user.setPid(map.get(0));
                    user.setPname(map.get(1));
                    user.setSex(map.get(2));
                    user.setTeam(map.get(3));
                    user.setRoleid(Integer.parseInt(map.get(4)));
                    user.setPwd(map.get(5));

                    try {
                        if(userService.countByPid(user.getPid()) == 0){
                            result += userService.insertSelective(user);
                        }else {
                            msg += "员工编号为:" + user.getPid() +"的用户已经存在!\\n";
                            continue;
                        }
                    } catch (Exception e) {
                        msg = "数据库插入异常！";
                        System.out.println(msg);
                        return searchUser(request,null,null,null,msg);
                    }
                }

                msg += "成功导入" + result + "条信息，失败" + (rowsNum - result - 1) + "条!";

            } catch (IOException e) {
                e.printStackTrace();
            } catch (BiffException e) {
                e.printStackTrace();
            }
        }
        return searchUser(request,null,null,null,msg);
    }

    //单个删除用户信息
    @RequestMapping("/deleteUser")
    public String deleteUser(HttpServletRequest request){
        String pid = request.getParameter("pid");
        String msg = "";
        if(!pid.equals("")){
            int result = userService.deleteByPrimaryKey(pid);
            if(result == 1){
                msg = "删除成功！";
            }else {
                msg ="删除失败！";
            }
        }
        return searchUser(request,null,null,null,msg);
    }

    //批量删除用户
    @ResponseBody
    @RequestMapping("/delCheckedUser")
    public  Map<Object,Object> delCheckedUser(String[] checkID){
        String msg = "";
        Map<Object,Object> resultMap=new HashMap<Object,Object>();
        int success = 0;
        int fail = 0;
        if(checkID!=null) {
            for (int i = 0; i < checkID.length; i++) {

                if (userService.deleteByPrimaryKey(checkID[i]) == 1) {
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
    //查询用户
    @RequestMapping("/searchUser")
    public String searchUser(HttpServletRequest request, String conditions, String keywords,Integer pageNum,String msg){
        User loginUser = (User) request.getSession().getAttribute("userInfo");
        if(loginUser.getRoleid()==1){
            PageInfo<User> pageInfo=userService.conditionQueryPage(pageNum,conditions,keywords );
            request.setAttribute("pageInfo",pageInfo);
            request.setAttribute("users",pageInfo.getList());
            request.setAttribute("conditions",conditions);
            request.setAttribute("keywords",keywords);
            if(pageInfo.getList().isEmpty()){
                if(msg==null){
                    msg = "没有查询到数据！";
                }else{
                    msg +="\\n没有查询到数据！";
                }

            }
        }else{
            msg = "您的管理权限不够，请与管理员联系！";
        }
        request.setAttribute("msg",msg);
        return "user-manage";
    }

    //
    @RequestMapping("/editUser")
    public String editUser(HttpServletRequest request,User user){
        String msg="";
        User loginUser = (User) request.getSession().getAttribute("userInfo");
        if(loginUser.getRoleid()==1){
            if(userService.updateByPid(user)==1){
                msg="修改成功！";
            }else{
                msg="修改失败！";
            }
        }else{
            msg = "您的管理权限不够，请与管理员联系！";
        }
        return searchUser(request,null,null,null,msg);
    }
}
