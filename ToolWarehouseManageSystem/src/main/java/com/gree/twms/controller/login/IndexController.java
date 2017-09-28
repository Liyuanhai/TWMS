package com.gree.twms.controller.login;


import com.gree.twms.pojo.User;
import com.gree.twms.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/twms")
@Controller
public class IndexController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/logging")
    public String logging(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String msg = "";
        if(username.equals("")||password.equals("")){
            msg = "用户名或密码不能为空！";
            request.setAttribute("msg",msg);
            return "login";
        }else{
            User user = userService.selectIsValidUser(username,password);
            if(user==null){
                msg = "用户名或密码错误！";
                request.setAttribute("msg",msg);
                return "login";
            }else{
                request.getSession().setAttribute("userInfo",user);
                return "index";
            }
        }
    }

    @RequestMapping("/login")
    public  String login(){
        return "login";
    }
}
