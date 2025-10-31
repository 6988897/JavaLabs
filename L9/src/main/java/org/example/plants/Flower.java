package org.example.plants;

public class Flower extends Plant {
    public Flower(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Цветок: " + getName());
    }
}
