package com.le.controller;

import com.le.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedHashMap;
import java.util.Map;

//@SessionAttributes(names = "user")
@SessionAttributes(types = User.class)

@Controller
public class HelloController06 {

    @RequestMapping("/modelView")
    public ModelAndView hello01() {

        //创建ModelAndView对象
        ModelAndView mav = new ModelAndView();

        //指定视图
        mav.setViewName("ok02");

        //添加模型数据 -- 默认是往request域中
        mav.addObject("username", "zhangsan");
        mav.addObject("passwrod", "123");

        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("age", 20);
        map.put("sex", "male");
        mav.addAllObjects(map);
        return mav;
    }

    @RequestMapping("/modelData")
    public String hello02(Model model) {

        //添加模块数据 -- 默认向request域添加
        model.addAttribute("username", "zhangsan");
        model.addAttribute("passwrod", "123");

        return "ok02";
    }

    @RequestMapping("/modelData2")
    public String hello03(Map<String, Object> map) {

        //添加模块数据 -- 默认向request域添加
        map.put("username", "zhangsan");
        map.put("passwrod", "123");

        return "ok02";
    }

    @RequestMapping("/modelData3")
    public String hello04(ModelMap mm) {

        //添加模块数据 -- 默认向request域添加
        mm.put("username", "zhangsan");
        mm.addAttribute("passwrod", "123");

        return "ok02";
    }

    @RequestMapping("/session1")
    public String hello05(Model model) {

        //添加模块数据 -- 默认向request域添加
        User user = new User(1, "lisi");
        model.addAttribute("user", user);

        return "ok02";
    }

    @RequestMapping("/session2")
    public String hello06(Model model) {

        //添加模块数据 -- 默认向request域添加
        User user = new User(1, "wangwu");
        model.addAttribute("u", user);

        return "ok02";
    }
}
