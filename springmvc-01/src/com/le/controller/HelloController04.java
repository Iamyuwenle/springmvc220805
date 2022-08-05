package com.le.controller;

import com.le.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController04 {

    @RequestMapping("/param")
    public String hello01(@RequestParam("username") String username,
                          @RequestParam(name = "pwd", required = false, defaultValue = "123456") String pwd) {
        System.out.println(username + " " + pwd);
        return "ok";
    }

    @RequestMapping("/param2")
    public String hello02(@RequestParam List<String> course) {
        System.out.println(course);
        return "ok";
    }

    @RequestMapping("/param3")
    public String hello03(String[] course) {
        System.out.println(Arrays.toString(course));
        return "ok";
    }

    @RequestMapping("/param4")
    public String hello04(Student student) {
        System.out.println(student);
        return "ok";
    }

    @RequestMapping("/param5")
    public String hello05(HttpServletRequest request) {

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        System.out.println(id + " " + name);
        return "ok";
    }

}
