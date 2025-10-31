package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        DataObject user = new UserData("Анастасия", 20);
        DataObject system = new SystemData("Рабочая станция", "Windows 11");

        user.display();
        system.display();
    }

}
