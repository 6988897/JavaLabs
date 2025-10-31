package org.example.Employeis;

import java.util.List;

public class Report {
    public static void generateReport(List<Employee> employees) {
        System.out.printf("%-5s %-20s %-15s%n", "ID", "Имя", "Среднемесячная зарплата");

        for (Employee e : employees) {
            System.out.printf("%-5d %-20s %-15.2f%n",
                    e.getId(), e.getFullName(), e.getAverageMonthlySalary());
        }
    }
}


