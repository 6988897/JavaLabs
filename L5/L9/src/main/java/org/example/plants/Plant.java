package org.example.plants;

public class Plant {
    private String name;

    public  Plant (String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println("Растение: "+ name);
    }
}
