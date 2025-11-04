package org.example;
public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
     }
    public Tester(String name, String surname, int expirienceInYears, double salary) {
        this(name, surname);
        this.expirienceInYears = expirienceInYears;
        this.salary = salary;
    }
    public Tester(String name, String surname, int expirienceInYears, double salary, String englishLevel) {
        this(name, surname, expirienceInYears, salary);
        this.englishLevel=englishLevel;
    }
    public void printInfo(){
        System.out.println("Тестировщик: " + name + " " + surname +
                ", Опыт: " + expirienceInYears + " лет, Уровень английского: " + englishLevel +
                ", Зарплата: " + salary + " руб.");
    }
    public void printInfo(boolean shortInfo) {
        if (shortInfo) {
            System.out.println("Тестировщик: " + name + " " + surname);
        } else {
            printInfo();
        }
    }

    public void printInfo(String hello) {
        if (hello.equals("hello")) {
            System.out.println("Приветствуем Вас, " + name + " " + surname+'!');
        } else {
            printInfo();
        }
    }
}

