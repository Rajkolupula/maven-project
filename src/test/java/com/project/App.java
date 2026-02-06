package com.project; // <--- MUST MATCH FOLDER PATH

public class App {
    public static void main(String[] args) {
        System.out.println("Application Started Successfully!");
        try {
            // This loop keeps the Pod 'Running' so Grafana can see it
            while (true) {
                Thread.sleep(5000); 
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
    
    public int userLogin(String u, String p) {
        return (u.equals("abc") && p.contains("@")) ? 1 : 0;
    }
}
