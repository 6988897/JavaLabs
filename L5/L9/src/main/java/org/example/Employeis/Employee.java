package org.example.Employeis;

public abstract class Employee {
    private static int counter = 1;
    private int id;
    private String fullName;

    public Employee(String fullName) {
        this.fullName = fullName;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public abstract double getAverageMonthlySalary();
}

