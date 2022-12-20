// Sum of first n natural numbers

import java.util.*;

public class Sum_Of_First_n_Natural_Numbers {

    public static void main(String[] args) {

        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range = ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            sum = sum + i;
        }

        System.out.println("Sum of first " + n + " Natural numbers is = " + sum);

        sc.close();
    }
}
