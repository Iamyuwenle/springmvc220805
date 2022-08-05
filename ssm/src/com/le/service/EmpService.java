package com.le.service;

import com.le.dao.EmpMapper;
import com.le.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    //注入EmpMapper
    @Autowired
    private EmpMapper empMapper;


    //全查员工的业务方法
    public List<Emp> allEmpService() {
        return empMapper.allEmp();
    }

    //根据id删除员工
    public void delEmpService(Integer id) {
        empMapper.delEmp(id);
    }

    //增加员工
    public void seveEmpService(Emp emp) {
        empMapper.saveEmp(emp);
    }

    //修改员工
    public void updateEmpService(Emp emp) {
        empMapper.updateEmp(emp);
    }

}
