package com.gree.twms.controller.login;


import com.gree.twms.pojo.User;
import com.gree.twms.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

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
                return "index";
            }
        }
    }
    @ResponseBody
    @RequestMapping("/editPassword")
    public Map<Object,Object> editPassword(HttpServletRequest request,String oldPassword,String newPassword){
        String msg = "";
        Map<Object,Object> resultMap = new HashMap<Object,Object>();
        User user = (User) request.getSession().getAttribute("userInfo");
        user.setPwd(oldPassword);
        if(userService.selectIsValidUser(user)!=null){
            user.setPwd(newPassword);
            if(userService.updateByPid(user)==1){
                msg = "修改成功！";
                resultMap.put("success",true);
            }else{
                msg="修改失败！";
                resultMap.put("fail",false);
            }
        }else{
            msg="原密码错误，请重新输入！";
            resultMap.put("fail",false);
        }

        resultMap.put("msg",msg);
        return resultMap;
    }
    //跳转登录页面
    @RequestMapping("/index")
    public  String index(HttpServletRequest request){
        if(isLogged(request)) {
            return "index";
        }else {
            return "login";
        }
    }

    //跳转登录页面
    @RequestMapping("/login")
    public  String login(){
        return "login";
    }

    //退出登录
    @RequestMapping("/loginOut")
    public  String loginOut(HttpServletRequest request){
        request.getSession().removeAttribute("userInfo");
        return "login";
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

    public boolean isLogged(HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("userInfo");
        if(user == null){
            return false;
        }else{
            return true;
        }
    }
}
