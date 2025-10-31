package org.example;

public abstract class DataObject {
    protected String name;

    public DataObject(String name) {
        this.name = name;
    }

    abstract void display();
}



