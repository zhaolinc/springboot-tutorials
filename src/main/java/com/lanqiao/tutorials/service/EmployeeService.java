package com.lanqiao.tutorials.service;

import com.github.pagehelper.Page;
import com.lanqiao.tutorials.model.Employee;

import java.util.List;

public interface EmployeeService {
    //根据ID查员工
    public Employee selectById(Integer empno);
    //更新员工
    public int updateEmp(Employee employee);
    //删除员工
    public int deleteEpmByDeptno(Integer empno);
    //增加员工
    public int insertEmp(Employee employee);
    //分页查员工
    public Page<Employee> select(Employee emp, int pageNum, int pageSize);
}
