package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        return "贾先浩";
    }

    @RequestMapping("/hello1")
    public String hello1(){
        return "贾先浩";
    }
}
