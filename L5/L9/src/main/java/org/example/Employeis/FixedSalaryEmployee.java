package org.example.Employeis;

public class FixedSalaryEmployee extends Employee {
    private double monthlySalary;

    public FixedSalaryEmployee(String fullName, double monthlySalary) {
        super(fullName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getAverageMonthlySalary() {
        return monthlySalary;
    }
}