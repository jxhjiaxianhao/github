package com.example.demo;

import com.example.demo.JXH.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;


@SpringBootTest
class DemoApplicationTests {


    @Test
    void contextLoads() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String format = LocalDate.now().format(dateTimeFormatter);
        System.out.println(format);
    }

    @Test
    void test() {
//       List<String> list=new ArrayList();
//       list.add("jia");
//       list.add("xian");
//       list.add("hao");
//        List<String> j = list.stream().filter(n -> n.startsWith("j")).collect(Collectors.toList());
//        System.out.println(j);
        System.out.println("nnn");
    }


    @Test
    void test1() {
        List<Dog> list = new ArrayList<>();
        list.add(new Dog().show());
        for (Dog dog : list) {
            System.out.println(dog);
        }
    }
    @Autowired
    private  User user;
    @Autowired
    private Dog dog;
    @Test
    void test2() {
        System.out.println("====");
    }
}

