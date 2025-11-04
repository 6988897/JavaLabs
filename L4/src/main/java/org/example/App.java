package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello, АНАСТАСИЯ!" );
        Tester[] testers = {
                new Tester("Иван", "Петров", 2, 9000, "Intermediate"),
                new Tester("Анна", "Сидорова", 5, 15000,"Upper-Intermediate"),
                new Tester("Олег", "Иванов", 1, 6900,"Beginner")
        };
        System.out.println();
        testers[0].printInfo(true);
        System.out.println();
        testers[1].printInfo("hello");
        System.out.println();
        printTesters(testers);
    }
    public static void printTesters(Tester[] testers) {
        for (Tester tester : testers) {
            tester.printInfo();
        }
    }
}
