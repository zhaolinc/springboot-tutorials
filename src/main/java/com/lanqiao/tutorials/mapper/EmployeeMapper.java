package com.lanqiao.tutorials.mapper;

import com.github.pagehelper.Page;
import com.lanqiao.tutorials.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @Entity com.example.tutorials.model.Empoyee.Employee
*/
@Mapper
public interface EmployeeMapper{
    //更新员工信息
    public int updateEmp(Employee  employee);

    //根据ID查询员工
    public Employee selectById(Integer empno);

    //删除员工
    public int deleteEpmByDeptno(Integer empno);

    //分页选择员工
    public Page<Employee> select(@Param("emp") Employee emp,
                                 @Param("pageNum") int pageNum,
                                 @Param("pageSize") int pageSize);

    //增加员工
    public int insertEmp(Employee employee);
}

