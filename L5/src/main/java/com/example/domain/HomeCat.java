package com.example.domain;


public class HomeCat extends Cat {
    public HomeCat(String name, int age) {
        super(name, age);
    }

    public void doSomething() {
        System.out.println(name + " сладко спит на диване.");
    }
}
