package com.project;

public class App {
    public int userLogin(String username, String password) {
        if (username.equals("abc") && password.contains("@")) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("--- Java Application Starting ---");
        System.out.println("Waiting for Prometheus to scrape metrics...");
        try {
            while (true) {
                Thread.sleep(10000); 
            }
        } catch (InterruptedException e) {
            System.out.println("App Interrupted.");
        }
    }
}
