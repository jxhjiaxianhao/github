package com.example.demo;

import lombok.Data;

@Data
public class User implements Comparable<User> {
    private Integer integer;

    @Override
    public int compareTo(User o) {
        System.out.println("this::"+this.integer);
        System.out.println("o::"+o.integer);
        System.out.println(this.integer.compareTo(o.integer));
        return this.integer.compareTo(o.integer);
    }
}

