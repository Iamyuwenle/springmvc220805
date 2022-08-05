package com.le.controller;

import com.le.pojo.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController01 {

    @RequestMapping("/html")
    public String hello01() {
        System.out.println("成功return到html");
        return "html";
    }

    @RequestMapping("/export")
    public String hello02(Model model) {

        Customer c1 = new Customer(1, "张三", 21, "男", "zs@qq.com");
        Customer c2 = new Customer(2, "李四", 22, "女", "ls@qq.com");
        Customer c3 = new Customer(3, "王五", 23, "男", "ww@qq.com");
        Customer c4 = new Customer(4, "赵六", 24, "女", "zl@qq.com");
        Customer c5 = new Customer(5, "孙七", 21, "男", "sq@qq.com");
        Customer c6 = new Customer(6, "王八", 22, "女", "wb@qq.com");
        Customer c7 = new Customer(7, "田九", 23, "男", "tq@qq.com");
        Customer c8 = new Customer(8, "陈十", 24, "女", "cs@qq.com");
        Customer c9 = new Customer(9, "萧十一", 21, "男", "xsy@qq.com");
        Customer c10 = new Customer(10, "金十二", 22, "女", "jse@qq.com");
        List<Customer> customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        customerList.add(c5);
        customerList.add(c6);
        customerList.add(c7);
        customerList.add(c8);
        customerList.add(c9);
        customerList.add(c10);

        model.addAttribute("customers", customerList);

        System.out.println("成功return到export");
        return "excel";
    }

    //=====================================================================

    @RequestMapping("/forward")
    public String hello03(Model model) {

        model.addAttribute("username", "admin");
        model.addAttribute("password", "123456");
        return "forward:WEB-INF/views/ok.jsp";
    }

    @RequestMapping("/direct")
    public String hello04(HttpSession session) {

        session.setAttribute("username", "admin");
        session.setAttribute("password", "123456");
        return "redirect:ok.jsp";
    }
}
