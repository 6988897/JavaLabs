package org.example;

public class SystemData extends DataObject {
    private String osVersion;

    public SystemData(String name, String osVersion) {
        super(name);
        this.osVersion = osVersion;
    }

    @Override
    void display() {
        System.out.println(" Система: " + name + ", версия ОС: " + osVersion);
    }
}
