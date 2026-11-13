package lab05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    static final List<String[]> 
    students = new ArrayList<>();
    static void sumToN(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("[Sum]    Sum 1.." + n + " = " + sum);
    }
    static void showPrimes() {
        StringBuilder sb = new StringBuilder();
        for (int num = 2; num <= 100; num++) {
            boolean prime = true;
            for (int d = 2; d * d <= num; d++) {
                if (num % d == 0) { 
                    prime = false; break; 
                }
            }
            if (prime) sb.append(num).append(' ');
        }
        System.out.println("[Primes] " + sb.toString().trim());
    }
    static void loadStudents(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();         
            while ((line = br.readLine()) != null) {
                if (!line.isBlank()) students.add(line.split(","));
            }
            System.out.println("[CSV]    Student list loaded! (" + students.size() + " students)");
        } catch (IOException e) {
            System.out.println("[CSV]    Could not read file: " + e.getMessage());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override public void run() { sumToN(100); }
        };
        Thread t2 = new Thread() {
            @Override public void run() { showPrimes(); }
        };
        Thread t3 = new Thread() {
            @Override public void run() { loadStudents("students.csv"); }
        };
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("\nStudents read from CSV:");
        for (String[] s : students) {
            System.out.printf("  Name: %-14s ID: %s  Age: %s  Gender: %s%n", s[0], s[1], s[2], s[3]);
        }
        System.out.println("\nAll threads finished.");
    }
}
