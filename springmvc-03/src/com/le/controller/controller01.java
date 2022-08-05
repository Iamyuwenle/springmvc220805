package com.le.controller;

import com.le.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class controller01 {

    @RequestMapping("/sendJson")
    public void hello01(@RequestBody User user,
                        HttpServletResponse response)
            throws IOException {

        System.out.println(user);

        response.getWriter().write("ok");
    }

    /*@ResponseBody
    @RequestMapping("/getJson")
    public User hello02() {

        User user = new User(9527, "唐伯虎");

        return user;
    }*/

    /*
        1.方法返回值User对象
        2.方法上标注@ResponseBody注解
          表示Springmvc会将返回值Map转成json字符串响应给ajax引擎;
     */
    /*@ResponseBody
    @RequestMapping("/getJson")
    public Map<String, Object> hello03() {

        Map<String, Object> map = new HashMap<>();
        map.put("id", 9523);
        map.put("name", "祝英台");

        return map;
    }*/

    /*
        1.方法返回值List<User>
        2.方法上标注@ResponseBody注解
          表示Springmvc会将返回值MapList<User>转成字json数组响应给ajax引擎;
     */
    /*@ResponseBody
    @RequestMapping("/getJson")
    public List<User> hello04() {

        List<User> userList = new ArrayList<>();
        userList.add(new User(001, "曹操"));
        userList.add(new User(002, "刘备"));
        userList.add(new User(003, "孙权"));

        return userList;
    }*/


    /*
        1.方法返回值String
        2.方法上标注@ResponseBody注解
          表示直接将返回值字符串响应给客户端;
     */
    @ResponseBody
    @RequestMapping("/getJson")
    public String hello05() {

        return "没毛病";
    }
}
