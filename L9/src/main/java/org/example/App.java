package org.example;

import org.example.plants.Flower;
import org.example.plants.Plant;
import org.example.plants.Tree;
import org.example.Employeis.*;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<String, Plant> plants = new HashMap<>();
        plants.put("Береза", new Tree("Береза"));
        plants.put("Роза", new Flower("Роза"));
        plants.put("Ель", new Tree("Ель"));
        plants.put("Тюльпан", new Flower("Тюльпан"));

        System.out.println("Названия растений:");
        for (String key : plants.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nИнформация о растениях:");
        for (Plant plant : plants.values()) {
            plant.display();
        }

        System.out.println();
        System.out.println();

        List<Student> students = new ArrayList<>();

        students.add(new Student("Алексей", "Т-101", 1, Arrays.asList(4, 5, 3, 4)));
        students.add(new Student("Мария", "Л-102", 2, Arrays.asList(2, 3, 2, 2)));
        students.add(new Student("Ольга", "Т-103", 3, Arrays.asList(8, 9, 7, 5)));
        students.add(new Student("Дмитрий", "Б-104", 1, Arrays.asList(3, 3, 3, 4)));

        System.out.println("Исходный список студентов:");
        for (Student s : students) {
            System.out.println(s);
        }

        updateStudents(students);

        System.out.println("\nПосле проверки и перевода:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\nСтуденты 2 курса:");
        printStudents(students, 2);


        List<Employee> employees = new ArrayList<>();

        employees.add(new FixedSalaryEmployee("Иван Иванов", 80000));
        employees.add(new HourlySalaryEmployee("Петр Петров", 75000));
        employees.add(new FixedSalaryEmployee("Анна Смирнова", 82000));
        employees.add(new HourlySalaryEmployee("Мария Кузнецова", 400));
        employees.add(new FixedSalaryEmployee("Денис Орлов", 82000));
        employees.add(new HourlySalaryEmployee("Екатерина Соколова", 250));
        employees.add(new HourlySalaryEmployee("Олег Сидоров", 500));

        employees.sort(Comparator
                .comparingDouble(Employee::getAverageMonthlySalary)

                .thenComparing(Employee::getFullName));

        Report.generateReport(employees);

        System.out.println("\n b) Первые 5 имён работников:");
        employees.stream()
                .limit(5)
                .forEach(e -> System.out.println(e.getFullName()));

        System.out.println("\nc) Последние 3 идентификатора работников:");
        employees.stream()
                .skip(Math.max(0, employees.size() - 3))
                .forEach(e -> System.out.println(e.getId()));

    }

    public static void updateStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }


}
