package com.gree.twms.controller.login;

import com.gree.twms.pojo.User;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns="/*", description="登录验证过滤器")
public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        //
        String url = ((HttpServletRequest) servletRequest).getRequestURI();
        //
        User userInfo = (User)session.getAttribute("userInfo");
        if(url.endsWith(".css")||url.endsWith(".js")||url.endsWith(".png")||url.endsWith(".jpg")
                ||url.endsWith(".gif")||url.endsWith("login")||url.endsWith("logging")
        ){
            filterChain.doFilter(servletRequest,servletResponse);
        }else if (userInfo == null && !url.endsWith("logging")){
            request.setAttribute("msg","登录已过期，请重新登录！");
            request.getRequestDispatcher(((HttpServletRequest) servletRequest).getContextPath() + "/twms/login").forward(request,response);
            //response.sendRedirect(((HttpServletRequest) servletRequest).getContextPath() + "/twms/login");
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
