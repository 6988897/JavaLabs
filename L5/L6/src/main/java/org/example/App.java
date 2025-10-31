package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Hedgehog h1 = new Hedgehog();
        Hedgehog h2 = new Hedgehog("Ёжик", 3, 1.2, "коричневый");

        h1.showInfo();
        h1.walk();
        h1.eat();

        h2.showInfo();
        h2.walk();
        h2.eat();
    }
}
