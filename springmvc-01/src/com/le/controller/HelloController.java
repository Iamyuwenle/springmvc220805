package com.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("请求处理完成。。。");
        return "ok";
    }

    /*
        @RequestMapping(value = "/hello2", params = {"username", "age"})
        请求路径是/项目/hello2

        请求 URL: http://localhost:8080/springmvc_01/
     */
    /*@RequestMapping(value = "/hello2", params = {"username", "age"}, headers = {"Host=localhost:8080", "name"})*/
    @RequestMapping(value = "/hello2", params = {"username", "age"}, headers = {"Host=localhost:8080"})
    public String hello02() {
        System.out.println("hello2请求处理完成。。。");
        return "ok";
    }

    /*@RequestMapping(value = "/hello3", method = RequestMethod.POST)*/
    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String hello03() {
        System.out.println("请求处理完成。。。");
        return "ok";
    }

    @RequestMapping(value = "/addUser??")
    public String hello04() {
        return "ok";
    }

    @RequestMapping(value = "/user/*/addUser")
    public String hello05() {
        return "ok";
    }

    @RequestMapping(value = "/emp/**/addEmp")
    public String hello06() {
        return "ok";
    }

}
