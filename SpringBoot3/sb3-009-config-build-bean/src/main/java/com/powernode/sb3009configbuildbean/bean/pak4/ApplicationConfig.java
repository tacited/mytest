package com.powernode.sb3009configbuildbean.bean.pak4;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    @ConfigurationProperties(prefix = "address01")
    public Address getAddress(){
        return new Address();
    }

}
