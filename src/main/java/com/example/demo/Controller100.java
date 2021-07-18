package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller100 {

    @RequestMapping("/test100")
    public String test(){
        return "你好啊";
    }
}
