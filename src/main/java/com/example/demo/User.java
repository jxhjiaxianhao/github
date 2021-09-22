package com.example.demo;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Data
@Component
public class User {
    public String name;
    private Integer id;

    public void show() {
        System.out.println(99);
    }
}

