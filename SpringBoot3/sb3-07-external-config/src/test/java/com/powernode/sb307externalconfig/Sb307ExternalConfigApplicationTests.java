package com.powernode.sb307externalconfig;

import com.powernode.sb307externalconfig.servic.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb307ExternalConfigApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        userService.printInfo();
    }

}
