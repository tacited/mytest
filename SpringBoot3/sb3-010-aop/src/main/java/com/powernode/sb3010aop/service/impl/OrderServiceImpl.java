package com.powernode.sb3010aop.service.impl;

import com.powernode.sb3010aop.service.OrderService;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Override
    public void generate(Integer id,String name) {
        System.out.println("生成订单");

    }

    @Override
    public void detail(Integer id) {
        System.out.println("订单详细");
    }
}
