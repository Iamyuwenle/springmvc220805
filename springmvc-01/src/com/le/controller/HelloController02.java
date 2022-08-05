package com.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("a")
@Controller
public class HelloController02 {

    @RequestMapping(value = "b")
    public String hello() {
        return "ok";
    }
}
