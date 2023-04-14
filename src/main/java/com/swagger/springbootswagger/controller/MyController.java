package com.swagger.springbootswagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/message")
    public String message(){
        return "Welcome to Swagger API";
    }

    @GetMapping("/wish")
    public String wish(String name){
        return "Wish you " + name;
    }
}
