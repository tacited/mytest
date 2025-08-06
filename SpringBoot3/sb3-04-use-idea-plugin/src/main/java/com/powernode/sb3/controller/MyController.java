package com.powernode.sb3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MyController {
    @RequestMapping("/hello")
    public String index(){
        return "Hello world!";
    }
}
