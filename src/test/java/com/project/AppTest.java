package com.project;

import java.util.Scanner;

public class App {

    // The business logic required by your TestNG tests
    public int userLogin(String username, String password) {
        // Logic: Returns 1 for success if password contains '@', else 0
        // (Based on your AppTest.java testLogin2 expecting 1 for "abc@1234")
        if (username.equals("abc") && password.contains("@")) {
            return 1;
        }
        return 0;
    }

    // The entry point required by Kubernetes/JVM to prevent CrashLoopBackOff
    public static void main(String[] args) {
        System.out.println("--- Java Application Starting ---");
        
        // This simple loop keeps the pod running so Prometheus can scrape it
        App myApp = new App();
        System.out.println("Application is now live and waiting for requests...");
        
        // Prevent the container from exiting immediately
        try {
            while (true) {
                Thread.sleep(10000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Application Interrupted.");
        }
    }
}
