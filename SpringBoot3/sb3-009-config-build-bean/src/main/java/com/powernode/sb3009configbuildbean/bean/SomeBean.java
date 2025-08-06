package com.powernode.sb3009configbuildbean.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SomeBean {
    @Autowired
    private Environment environment;
    public void doSome(){
        String[] activateProiles= environment.getActiveProfiles();
        for (String activateProile : activateProiles) {
            System.out.println(activateProile);
        }
        String street= environment.getProperty("app2.address.street");
        System.out.println(street);
    }
}
