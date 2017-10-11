package com.gree.twms.controller.userManage;

import com.gree.twms.pojo.User;
import com.gree.twms.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@RequestMapping("/twms")
@Controller
public class UserManageController {

    @Autowired
    private IUserService userService;

    //插入单个用户信息
    @RequestMapping("/insertUser")
    public String insertUser(User user,HttpServletRequest request){
        String msg="";
        int result = userService.insertSelective(user);
        if(result == 1){
            msg = "添加用户成功！";
        }else {
            msg = "添加用户失败！";
        }
        List<User> users = null;
        users = userService.selectAllUser();
        request.setAttribute("users",users);
        request.setAttribute("msg",msg);
        return "user-manage";
    }

    //导入用户信息
    @RequestMapping("/importUsers")
    public String importUsers(HttpServletRequest request, MultipartFile file){
        User user = new User();
        String msg = "";
        int result = 0;
        if(file.getName().endsWith(".xlsx")){
            msg = "系统不支持excel-2007（以.xlsx结尾的文件)格式，请使用excel 97-2003（以.xls结尾的文件）";
            request.setAttribute("msg",msg);
            return "user-manage";
        }else if(file.getName().endsWith(".xls")) {
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
                        result += userService.insertSelective(user);
                    } catch (Exception e) {
                        msg = "导入失败！已成功" + result + "条，请检查数据是否正确！";
                        request.setAttribute("msg", msg);
                        return "user-manage";
                    }
                }
                if (result == 0) {
                    msg = "导入用户信息失败！";
                } else {
                    msg = "成功导入" + result + "条信息，失败" + (rowsNum - result - 1) + "条";
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (BiffException e) {
                e.printStackTrace();
            }
        }
        List<User> users = null;
        users = userService.selectAllUser();
        request.setAttribute("users",users);
        return "user-manage";
    }

}
