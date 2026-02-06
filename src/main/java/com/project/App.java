package com.project;
import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) {
        System.out.println("Application starting...");
        try {
            // Test the resource bundle immediately to catch errors
            ResourceBundle rb = ResourceBundle.getBundle("config");
            System.out.println("Config loaded! Username: " + rb.getString("username"));
            
            // Keep the pod running for Grafana metrics
            while (true) {
                Thread.sleep(10000);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1); // Force a crash so you can see the error in logs
        }
    }
}
