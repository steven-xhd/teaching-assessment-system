package com.tces;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan(basePackages = "com.tces.mapper")// mapper包扫描
public class TeachingAssessmentSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachingAssessmentSystemApplication.class, args);
    }

}
