package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller1 {

    @RequestMapping("/test")
    public String test(){
        return "你好啊";
    }
}
