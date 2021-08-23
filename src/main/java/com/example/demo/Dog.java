package com.example.demo;

import lombok.Data;

@Data
public class Dog {
    public Dog(String name) {
        this.name = name;
    }

    private String name;
}
