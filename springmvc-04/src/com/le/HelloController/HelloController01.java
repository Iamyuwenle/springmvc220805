package com.le.HelloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.Servlet;

@Controller
public class HelloController01 {

    @RequestMapping("/hello01")
    public String hello01() {
        return "ok";
    }
}
