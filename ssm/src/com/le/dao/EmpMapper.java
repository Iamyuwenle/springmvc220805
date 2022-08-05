package com.le.dao;

import com.le.domain.Emp;

import java.util.List;

public interface EmpMapper {

    //查询所有员工的方法
    public List<Emp> allEmp();

    //根据id删除员工
    public void delEmp(Integer id);

    //增加员工的方法
    public void saveEmp(Emp emp);

    //根据id修改员工的方法
    public void updateEmp(Emp emp);
}
