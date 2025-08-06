package com.powernode.sb305core;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Date;


@SpringBootApplication
public class Sb305CoreApplication {
    @Bean
    public Date getNowDate(){
        return new Date();
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Sb305CoreApplication.class,args);
        Date dateBean1=applicationContext.getBean(Date.class);
        System.out.println(dateBean1);
        Date dateBean2=applicationContext.getBean("getNowDate",Date.class);
        System.out.println(dateBean2);
    }

}
