package com.project;

import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) {
        System.out.println("App started! Monitoring active...");
        
        // This keeps the pod running so you can see metrics in Grafana
        while (true) {
            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public int userLogin(String in_user, String in_pwd) {
        ResourceBundle rb = ResourceBundle.getBundle("config");
        String username = rb.getString("username");
        String password = rb.getString("password");

        return (in_user.equals(username) && in_pwd.equals(password)) ? 1 : 0;
    }
}
