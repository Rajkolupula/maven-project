package com.project;

import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) {
        System.out.println("Application Started Successfully!");
        
        // This loop keeps the process alive so GKE doesn't restart it
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int userLogin(String in_user, String in_pwd) {
        // This looks for config.properties in src/main/resources
        ResourceBundle rb = ResourceBundle.getBundle("config");
        String username = rb.getString("username");
        String password = rb.getString("password");

        return (in_user.equals(username) && in_pwd.equals(password)) ? 1 : 0;
    }
}
