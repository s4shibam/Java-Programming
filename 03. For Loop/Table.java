// Multiplication Table

import java.util.*;

public class Table {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to create its table = ");
        int num = sc.nextInt();

        System.out.println("\nTable of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }

        sc.close();
    }
}
