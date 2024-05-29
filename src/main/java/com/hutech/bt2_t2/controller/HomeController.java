package com.hutech.bt2_t2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;



@Controller
public class HomeController {
    @GetMapping("/")
    public String getMethodName(Model model) {
        return "index";
    }
    
    
}
