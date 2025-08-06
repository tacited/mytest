package com.powernode.sb3013ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = {"com.powernode.sb3013ssm.repository"})
@SpringBootApplication
public class Sb3013SsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sb3013SsmApplication.class, args);
    }

}
