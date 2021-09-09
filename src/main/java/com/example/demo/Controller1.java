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

        list.add(new Dog().show());

        List<String> list1 = new ArrayList<>();
        list1.add("333");
        System.out.println(JSONObject.toJSONString(list1));
        System.out.println(Result.ok(list1));
        System.out.println(JSONObject.toJSONString(Result.ok(list1)));
        return Result.ok(list);
    }


    @RequestMapping("/show")
    public void show() {
        System.out.println(user);
        dog.show3();
    }

}
