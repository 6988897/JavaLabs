package org.example;


public class App 
{

        public static void main(String[] args) {
            DataObject u = new UserData("alice", "alice@example.com");
            DataObject s = new SystemData("Windows", "11");

            u.display();
            s.display();

            DataObject[] items = { u, s, new UserData("bob", "bob@site.org") };
            for (DataObject item : items) {
                item.display();
            }
        }
    }
