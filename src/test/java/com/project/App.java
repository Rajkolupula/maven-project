package com.project;

public class App {
    public int userLogin(String username, String password) {
        if (username.equals("abc") && password.contains("@")) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("LOG: Application has started successfully!");
        System.out.println("LOG: Waiting for Prometheus to scrape metrics on port 8080...");
        
        try {
            while (true) {
                // This keeps the pod alive so Grafana can see it
                Thread.sleep(10000); 
            }
        } catch (InterruptedException e) {
            System.err.println("LOG: Application interrupted.");
        }
    }
}
