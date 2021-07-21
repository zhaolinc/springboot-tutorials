package com.lanqiao.tutorials.service.impl;

import com.github.pagehelper.Page;
import com.lanqiao.tutorials.mapper.EmployeeMapper;
import com.lanqiao.tutorials.model.Employee;
import com.lanqiao.tutorials.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 赵林
 * @date 2021/7/16 14:37
 **/
@Service("empoyeeService")
public class EmpoyeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public Employee selectById(Integer empno) {
        return this.employeeMapper.selectById(empno);
    }

    @Override
    public int updateEmp(Employee employee) {
        return this.employeeMapper.updateEmp(employee);
    }

    @Override
    public int deleteEpmByDeptno(Integer empno) {
        return this.employeeMapper.deleteEpmByDeptno(empno);
    }

    @Override
    public int insertEmp(Employee employee) {
        return this.employeeMapper.insertEmp(employee);
    }

    @Override
    public Page<Employee> select(Employee emp, int pageNum, int pageSize) {
        return this.employeeMapper.select(emp,pageNum,pageSize);
    }

}
