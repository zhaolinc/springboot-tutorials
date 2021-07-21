package com.lanqiao.tutorials.controller;

import com.github.pagehelper.Page;
import com.lanqiao.tutorials.model.Employee;
import com.lanqiao.tutorials.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/emps")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public String selectForPage(HttpSession session,
                                Model model,
                                Employee emp,
                                @RequestParam(value = "pageNum",required = false) Integer pageNum) {
        if (pageNum==null) {
            //提交查询表单
            pageNum=1;
            //保留当前的查询条件，供接下来的点击分页时使用
            session.setAttribute("empCondition",emp);
        }else {
            //点击分页链接时取回查询条件
            emp= (Employee) session.getAttribute("empCondition");
        }
        final Page<Employee> employeeList = this.employeeService.select(emp,pageNum,5);
        //log.info(employeeList.toString());
        model.addAttribute("employeeList", employeeList);
        return "employee/employeelist";
    }

    @GetMapping("/{empno}")
    public String selectById(Model model,
                             @PathVariable Integer empno,
                             HttpSession session){
        Employee employee = this.employeeService.selectById(empno);
        model.addAttribute("emp",employee);
        session.setAttribute("emp",employee);
        return "employee/emp_update";
    }

    /*更新员工信息*/
    @PostMapping
    public String update(Employee employee,HttpSession session){
        Employee emp = (Employee)session.getAttribute("emp");
        log.info(emp.toString());
        //操作数据库代码
        employee.setEmpno(emp.getEmpno());
        this.employeeService.updateEmp(employee);
        return "redirect:/emps";
    }

    /*删除员工信息*/
    @GetMapping("/delete/{empno}")
    public String deleteEpmByDeptno(@PathVariable Integer empno){
        this.employeeService.deleteEpmByDeptno(empno);
        return "redirect:/emps";
    }

    /*增加员工信息*/
    @PostMapping("/insertEmp")
    public String insertEmp(Employee employee){
        this.employeeService.insertEmp(employee);
        return "redirect:/emps";
    }
}
