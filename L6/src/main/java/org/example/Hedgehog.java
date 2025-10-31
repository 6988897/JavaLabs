package org.example;

public class Hedgehog {
    private String name;
    int age;
    protected double weight;
    public String color;

    public Hedgehog() {
        this.name = "Безымянный ёжик";
        this.age = 1;
        this.weight = 0.5;
        this.color = "серый";
    }

    public Hedgehog(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    private void secret() {
        System.out.println(name + " прячется в клубок");
    }

    void walk() {
        System.out.println(name + " идёт гулять");
    }

    protected void eat() {
        System.out.println(name + " ест яблоко");
    }

    public void showInfo() {
        System.out.println("Имя: " + name + ", возраст: " + age + ", вес: " + weight + ", цвет: " + color);
    }


}
