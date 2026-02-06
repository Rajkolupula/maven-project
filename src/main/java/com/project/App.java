package com.project;

public class App {
    public static void main(String[] args) {
        System.out.println("Application starting...Raju");
        
        // This loop keeps the process alive so GKE shows "Running"
        try {
            while (true) {
                System.out.println("Heartbeat: Pod is alive. Monitoring active...");
                Thread.sleep(20000); // Wait 20 seconds between logs
            }
        } catch (InterruptedException e) {
            System.out.println("App interrupted, shutting down.");
            Thread.currentThread().interrupt();
        }
    }
}
    
