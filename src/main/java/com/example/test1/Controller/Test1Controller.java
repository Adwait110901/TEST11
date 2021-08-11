package com.example.test1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Controller {
    @GetMapping("/test")
    public String Test1(){
        return "Hello from 1st website";
    }
}
