
package lab05;

import java.util.Scanner;

public class Ex2 {

    static void add(double a, double b) {
        System.out.println("Result: " + (a + b));
    }

    static void subtract(double a, double b) {
        System.out.println("Result: " + (a - b));
    }

    static void multiply(double a, double b) {
        System.out.println("Result: " + (a * b));
    }

    static void divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    static void sum(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println("Sum from 1 to " + n + " = " + total);
    }

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== CALCULATOR MENU =====");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Sum from 1 to n");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = cin.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter two numbers: ");
                    double a1 = cin.nextDouble();
                    double b1 = cin.nextDouble();
                    add(a1, b1);
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    double a2 = cin.nextDouble();
                    double b2 = cin.nextDouble();
                    subtract(a2, b2);
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    double a3 = cin.nextDouble();
                    double b3 = cin.nextDouble();
                    multiply(a3, b3);
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    double a4 = cin.nextDouble();
                    double b4 = cin.nextDouble();
                    divide(a4, b4);
                    break;

                case 5:
                    System.out.print("Enter n: ");
                    int n = cin.nextInt();
                    sum(n);
                    break;

                case 0:
                    System.out.println("Exiting calculator...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        cin.close();
    }
}
