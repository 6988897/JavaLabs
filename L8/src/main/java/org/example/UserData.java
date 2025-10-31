package org.example;

public class UserData implements DataObject {
    private final String username;
    private final String email;

    public UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public void display() {
        System.out.println("UserData: " + username + " <" + email + ">");
    }
}
