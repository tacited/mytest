package com.powernode.sb3009configbuildbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:applicationContext.xml")
//@EnableConfigurationProperties(AppBean1.class)
@ConfigurationPropertiesScan(basePackages = {"com.powernode.sb3009configbuildbean.bean.pak3","com.powernode.sb3009configbuildbean.bean.pak1"})
@SpringBootApplication
public class Sb3009ConfigBuildBeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sb3009ConfigBuildBeanApplication.class, args);
    }

}
