package com.lanqiao.tutorials;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.lanqiao.tutorials.mapper"})
public class SpringbootTutorialsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTutorialsApplication.class, args);
    }

}
