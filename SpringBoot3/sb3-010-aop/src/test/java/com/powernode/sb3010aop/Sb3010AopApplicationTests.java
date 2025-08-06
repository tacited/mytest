package com.powernode.sb3010aop;

import com.powernode.sb3010aop.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb3010AopApplicationTests {
    @Autowired
    private OrderService orderService;
    @Test
    void contextLoads() {
        orderService.generate(10,"name");
        orderService.detail(10);
    }

}
