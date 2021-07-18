package com.example.demo;
import com.example.demo.JXH.Color1;
public class User {
    public static void main(String[] args) {
        Color1 red = Color1.RED;
        switch (red){
            case RED:
                System.out.println("1");
                break;
            case BLUE:
                System.out.println("2");
                break;
            case YELLOW:
                System.out.println("3");
                break;
            case GREEEN:
                System.out.println("4");
                break;
        }


        System.out.println(red.name().equals("RED"));
    }
}

