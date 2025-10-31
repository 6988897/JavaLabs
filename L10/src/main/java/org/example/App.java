package org.example;
import company.*;
import Exceptions.*;

public class App 
{
    public static void main( String[] args )
    {
        try {
            Sotrudnik s1 = new Sotrudnik("Иванов Иван", "Менеджер", -50000);
        } catch (OkladException e) {
            System.out.println(e.getMessage());
            try {
                throw new OkladException(-50000);
            } catch (OkladException ex) {
                System.out.println(ex.getMessage());
            }
        }

        try {
            ShtatnySotrudnik s2 = new ShtatnySotrudnik("Петров Петр", "Бухгалтер", 60000, -1000);
            System.out.println("Зарплата: " + s2.rasschitatZarplatu());
        } catch (OkladException e) {
            System.out.println(e.getMessage());
        }

        try {
            KontraktnySotrudnik s3 = new KontraktnySotrudnik("Сидоров Сидор", "Юрист", 50000);
            System.out.println("Зарплата: " + s3.rasschitatZarplatu());
        } catch (OkladException e) {
            System.out.println(e.getMessage());
        }
    }
}
