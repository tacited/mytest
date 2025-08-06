package com.powernode.sb0307ssm.controller;

import com.powernode.sb0307ssm.model.Vip;
import com.powernode.sb0307ssm.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.invoker.PathVariableArgumentResolver;

@RestController
public class VipController {

    @Autowired
    private VipService vipService;

    @GetMapping("/vip/{id}")
    public Vip detailById(@PathVariable Long id){
        Vip vip = vipService.getById(id);
        return vip;
    }
}
