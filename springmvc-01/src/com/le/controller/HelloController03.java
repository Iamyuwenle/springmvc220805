package com.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController03 {

    /*
        @RequestMapping("emp/{id}")
        路径占位符id会接收请求url emp/101 中101的值;

        @PathVariable("id") Integer no
      将占位符id的值(101)赋值给请求处理方法的参数no;

      @PathVariable Integer id
      默认表示将占位符id的值赋值给请求处理方法参数id

      @RequestMapping(value = "emp/{id}", method = RequestMethod.GET)
     */

    @GetMapping("/emp/{id}")
    public String hello01(@PathVariable Integer id) {
        System.out.println("查询：" + id + "的员工");
        return "ok";
    }

    /*
      @RequestMapping(value = "/emp", method = RequestMethod.POST)
      @PostMapping("/emp")
      处理url为/项目/emp,请求方式post的请求,还表示添加操作
     */
    @PostMapping("/emp")
    public String hello02() {
        System.out.println("添加员工");
        return "ok";
    }

    @PutMapping("/emp/{id}")
    public String hello03(@PathVariable Integer id) {
        System.out.println("修改员工：" + id);
        return "ok";
    }

    @DeleteMapping("/emp/{id}")
    public String hello4(@PathVariable Integer id){
        System.out.println("删除员工："+id);
        return "ok";
    }
}
