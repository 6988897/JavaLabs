package org.example.plants;

public class Tree extends Plant {
    public Tree(String name){
        super(name);
    }

    @Override
    public void display(){
        System.out.println("Дерево: " + getName());
    }
}
