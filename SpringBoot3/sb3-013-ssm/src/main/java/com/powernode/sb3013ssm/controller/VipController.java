package com.powernode.sb3013ssm.controller;

import com.powernode.sb3013ssm.model.Vip;
import com.powernode.sb3013ssm.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VipController {
    @Autowired
    private VipService vipService;

    @GetMapping("/vip/{id}")
    public Vip detailById(@PathVariable("id") Long id){
        Vip vip=vipService.getById(id);
        return vip;
    }
}