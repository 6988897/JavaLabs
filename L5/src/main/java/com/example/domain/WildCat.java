package com.example.domain;

public class WildCat extends Cat {
    public WildCat(String name, int age) {
        super(name, age);
    }

    public void doSomething() {
        super.showInfo();
        System.out.println(name + " охотится в лесу!");
    }
}