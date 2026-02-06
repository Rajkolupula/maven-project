package com.project;

public class App {
    public static void main(String[] args) {
        System.out.println("Application starting...Raju");
        
        // This loop is the "heartbeat" that keeps the Pod running
        try {
            while (true) {
                System.out.println("Pod is active and waiting for Grafana to scrape metrics...");
                // Sleep for 30 seconds so we don't spam the logs
                Thread.sleep(30000); 
            }
        } catch (InterruptedException e) {
            System.err.println("Application interrupted: " + e.getMessage());
        }
    }
}
