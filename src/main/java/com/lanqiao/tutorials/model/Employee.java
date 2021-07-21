package com.lanqiao.tutorials.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 赵林
 * @date 2021/7/16 14:47
 **/
@Data
@ToString
public class Employee {
        private Integer empno;
        private String ename;
        private String job;
        private Integer mgr;
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date hiredate;
        private Double sal;
        private Double comm;
        private Integer deptno;
}
