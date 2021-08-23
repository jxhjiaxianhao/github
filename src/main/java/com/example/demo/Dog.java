package com.example.demo;

import lombok.Data;

@Data
public class Dog {
    public Dog(String name,String id) {
        this.id=id;
        this.name = name;
    }
private String id;
    private String name;
}
