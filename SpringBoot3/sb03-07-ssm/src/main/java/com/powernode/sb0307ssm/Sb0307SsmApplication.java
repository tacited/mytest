package com.powernode.sb0307ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = {"com.powernode.sb0307ssm.repository"})
@SpringBootApplication
public class Sb0307SsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sb0307SsmApplication.class, args);
    }

}
