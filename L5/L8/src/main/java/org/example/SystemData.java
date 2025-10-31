package org.example;


public class SystemData implements DataObject {
    private final String osName;
    private final String version;

    public SystemData(String osName, String version) {
        this.osName = osName;
        this.version = version;
    }

    @Override
    public void display() {
        System.out.println("SystemData: " + osName + " v" + version);
    }
}
