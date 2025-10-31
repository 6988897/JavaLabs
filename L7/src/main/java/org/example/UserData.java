package org.example;

public class UserData extends DataObject {
    private int age;

    public UserData(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    void display() {
        System.out.println(" Пользователь: " + name + ", возраст: " + age + " лет");
    }
}
