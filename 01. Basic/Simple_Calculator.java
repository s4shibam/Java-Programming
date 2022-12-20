// Simple Calculator

import java.util.*;

public class Simple_Calculator {

    public static void main(String[] args) {

        int n1, n2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First number = ");
        n1 = scan.nextInt();
        System.out.print("Enter Second number = ");
        n2 = scan.nextInt();

        System.out.println("\n-- Simple Calculator --\n");
        // Addition
        System.out.printf("Addition: %d + %d = %d\n", n1, n2, n1 + n2);

        // Subtraction
        System.out.printf("Subtraction: %d - %d = %d\n", n1, n2, n1 - n2);

        // Multiplication
        System.out.printf("Multiplication: %d * %d = %d\n", n1, n2, n1 * n2);

        // Division
        System.out.printf("Division: %d / %d = %d\n", n1, n2, n1 / n2);

        scan.close();
    }
}
