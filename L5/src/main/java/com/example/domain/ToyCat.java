package com.example.domain;

public class ToyCat extends Cat {
    public ToyCat(String name, int age) {
        super(name, age);
    }

    public void doSomething() {
        System.out.println(name + " поёт песенку!");
    }
}
