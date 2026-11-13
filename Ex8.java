package lab05;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Ex8 {
    static final List<String[]> students = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        Runnable sumTask = () -> {
            int n = 100;
            long sum = 0;
            for (int i = 1; i <= n; i++) sum += i;
            System.out.println("[Sum]    Sum 1.." + n + " = " + sum);
        };
        Runnable primeTask = () -> {
            StringBuilder sb = new StringBuilder();
            for (int num = 2; num <= 100; num++) {
                boolean prime = true;
                for (int d = 2; d * d <= num; d++) {
                    if (num % d == 0) { prime = false; break; }
                }
                if (prime) sb.append(num).append(' ');
            }
            System.out.println("[Primes] " + sb.toString().trim());
        };
        Runnable csvTask = () -> {
            try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
                String line = br.readLine();        // skip header
                while ((line = br.readLine()) != null) {
                    if (!line.isBlank()) students.add(line.split(","));
                }
                System.out.println("[CSV]    Student list loaded! (" + students.size() + " students)");
            } catch (IOException e) {
                System.out.println("[CSV]    Could not read file: " + e.getMessage());
            }
        };
        Thread t1 = new Thread(sumTask);
        Thread t2 = new Thread(primeTask);
        Thread t3 = new Thread(csvTask);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("\nStudents read from CSV:");
        students.forEach(s -> System.out.printf("  Name: %-14s ID: %s  Age: %s  Gender: %s%n",
                s[0], s[1], s[2], s[3]));
        System.out.println("\nAll tasks completed!");
    }
}
