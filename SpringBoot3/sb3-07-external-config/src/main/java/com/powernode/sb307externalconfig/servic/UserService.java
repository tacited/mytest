package com.powernode.sb307externalconfig.servic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    @Value("${myapp.username}")
    private String username;

    @Value("${myapp.email}")
    private String email;

    @Value("${myapp.age}")
    private Integer age;

    @Value("${myapp.password:1234}")
    private String password;

    public void printInfo(){
        String str = String.join(",", username, email, String.valueOf(age),password);
        System.out.println(str);
    }
}
