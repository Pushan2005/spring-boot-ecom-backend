package com.pushan.smallbasketbackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @RequestMapping("/")
    @ResponseBody
    public String greet() {
        return "Hello Spring Boot!";
    }
}
