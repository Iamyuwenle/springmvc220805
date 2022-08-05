package com.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class HelloController05 {

    @RequestMapping("/heads")
    public String hello(@RequestHeader("Host") String host,
                        @RequestHeader(name = "username", required = false, defaultValue = "unknow") String username) {
        System.out.println(host + " " + username);
        return "ok";
    }

    @RequestMapping("/cookies")
    public String hello2(@CookieValue("JSESSIONID") String sessionid,
                         @CookieValue(value = "age", required = false, defaultValue = "18") String age){
        System.out.println(sessionid+"   "+age);
        return "ok";
    }

    @RequestMapping("/test01")
    public void hello3(HttpServletResponse response, HttpServletRequest request) throws IOException {

        //重定向
        response.sendRedirect(request.getContextPath() + "/index01.jsp");
    }

    @RequestMapping("/test02")
    public void hello4(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        //重定向
        request.setAttribute("username", "admin");

        HttpSession session = request.getSession();
        session.setAttribute("password", "123456");

        //请求转发
        request.getRequestDispatcher("/index01.jsp").forward(request,response);

    }

}
