package com.example.domain;


public class Cat {
    protected String name;
    protected int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println(name + " мяукает!");
    }

    public void showInfo() {
        System.out.println("Имя: " + name + ", возраст: " + age);
    }
}






