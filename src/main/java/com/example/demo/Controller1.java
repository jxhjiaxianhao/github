package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.JXH.Dog;
import com.example.demo.JXH.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class Controller1 {
    @Autowired
    private User user;
    @Autowired
    private Dog dog;

    @RequestMapping("/test")
    public Result test() {
        List<Dog> list = new ArrayList<>();

       return null;
    }

}
