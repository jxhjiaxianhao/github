package com.example.demo.JXH;

import com.deepoove.poi.data.TextRenderData;
import com.example.demo.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Data
@Component
public class Dog {
    @Autowired
    private User user;

    public Dog() {

    }

    private TextRenderData name;

    public Dog show() {
        Dog dog = new Dog();
        dog.name = new TextRenderData("/");
        return dog;
    }
    public void show3(){
        System.out.println(user);
//        String name = user.getName();
//        System.out.println(name);
    }

}
