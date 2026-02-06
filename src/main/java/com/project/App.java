package com.project;

/**
 * Standard Java Application for GKE Monitoring.
 * The while-loop ensures the process stays active so Prometheus can scrape metrics.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Application starting...Raju");
        System.out.println("Container is now stable. Checking Grafana for metrics...");

        try {
            while (true) {
                // Heartbeat log to confirm the app hasn't frozen
                System.out.println("Heartbeat: App is running...");
                
                // Sleep for 10 seconds (10,000 milliseconds)
                Thread.sleep(10000); 
            }
        } catch (InterruptedException e) {
            System.err.println("Application interrupted. Shutting down.");
            // Standard practice to preserve the interrupted status
            Thread.currentThread().interrupt(); 
        }
    }
} // Added the missing closing brace for the class
    
