package com.le.controller;

import com.le.domain.Emp;
import com.le.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    //注入EmpService
    @Autowired
    private EmpService empService;

    //处理全查请求的方法
    @RequestMapping("/allEmp")
    public List<Emp> allEmp() {
        return empService.allEmpService();
    }

    //根据id删除员工的方法
    @RequestMapping("/delEmp")
    public String delEmp(Integer id) {
        try {
            empService.delEmpService(id);
            return "1";
        } catch (Exception e) {
            return "0";
        }
    }

    //增加员工的方法
    @RequestMapping("/saveEmp")
    public Emp saveEmp(Emp emp) {
        empService.seveEmpService(emp);
        return emp;
    }

    @RequestMapping("/updateEmp")
    //修改员工的方法
    public String updateService(Emp emp) {
        try {
            empService.updateEmpService(emp);
            return "1";
        } catch (Exception e) {
            return "0";
        }
    }
}
