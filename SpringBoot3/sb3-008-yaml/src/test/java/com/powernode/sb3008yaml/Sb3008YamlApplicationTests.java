package com.powernode.sb3008yaml;

import com.powernode.sb3008yaml.servic.UserServiceMulti;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb3008YamlApplicationTests {
    @Autowired
    private UserServiceMulti userServiceMulti;
    @Test
    void contextLoads() {
        userServiceMulti.printInfo();
    }

}
