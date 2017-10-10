package com.gree.twms.controller.login;


import com.gree.twms.pojo.User;
import com.gree.twms.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/twms")
@Controller
public class IndexController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/logging")
    public String logging(HttpServletRequest request, User user){
        String msg = "";
        if(user.getPid().equals("")||user.getPwd().equals("")){
            msg = "用户名或密码不能为空！";
            request.setAttribute("msg",msg);
            return "login";
        }else{
            User result = userService.selectIsValidUser(user);
            if(result==null){
                msg = "用户名或密码错误！";
                request.setAttribute("msg",msg);
                return "login";
            }else{
                request.getSession().setAttribute("userInfo",result);
                User user1= (User) request.getSession().getAttribute("userInfo");
                return "index";
            }
        }
    }
    //跳转登录页面
    @RequestMapping("/index")
    public  String index(){
        return "index";
    }

    //跳转登录页面
    @RequestMapping("/login")
    public  String login(){
        return "login";
    }

    //退出登录
    @RequestMapping("/loginOut")
    public  String loginOut(){
        return "login";
    }

    //跳转到用户管理界面
    @RequestMapping("/user-manage")
    public  String userManage(){
        return "user-manage";
    }

    //跳转到仓库管理界面
    @RequestMapping("/warehouse-manage")
    public  String warehouseManage(){
        return "warehouse-manage";
    }

    //跳转到工装评审界面
    @RequestMapping("/tool-review")
    public  String toolReview(){
        return "tool-review";
    }

    //跳转到物料信息界面
    @RequestMapping("/material-info")
    public  String materialInfo(){
        return "material-info";
    }

    //跳转到工装维修信息界面
    @RequestMapping("/tool-repair")
    public  String toolRepair(){
        return "tool-repair";
    }

    //跳转到版本升级界面
    @RequestMapping("/version-update")
    public  String versionUpdate(){
        return "version-update";
    }

    //跳转到工装信息管理界面
    @RequestMapping("/tool-manage")
    public  String toolManage(){
        return "tool-manage";
    }

    //跳转到出入库台帐管理界面
    @RequestMapping("/IO-account")
    public  String IOAccount(){
        return "IO-account";
    }

    //跳转到评审表台帐管理界面
    @RequestMapping("/review-account")
    public  String reviewAccount(){
        return "review-account";
    }

    //跳转到维修记录台帐管理界面
    @RequestMapping("/repair-account")
    public  String repairAccount(){
        return "repair-account";
    }

    //跳转到版本升级台帐管理界面
    @RequestMapping("/update-account")
    public  String updateAccount(){
        return "update-account";
    }

    //跳转到物料信息台帐管理界面
    @RequestMapping("/material-account")
    public  String materialAccount(){
        return "material-account";
    }
}
