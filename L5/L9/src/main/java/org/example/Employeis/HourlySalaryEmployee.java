package org.example.Employeis;

public class HourlySalaryEmployee extends Employee {
    private double hourlyRate;

    public HourlySalaryEmployee(String fullName, double hourlyRate) {
        super(fullName);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getAverageMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }
}