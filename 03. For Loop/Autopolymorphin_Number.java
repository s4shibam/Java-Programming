// Autopolymorphin Number:
// A number is said to be Autopolymorphin Number if the remainder is that same number when its square is divided by 10 or 100 respectively for 2 digits and 3 digits number.

import java.util.*;
import java.lang.Math;

public class Autopolymorphin_Number {
    public static void main(String[] args) {

        int num, digit = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number = ");
        num = scan.nextInt();
        int sq = num * num;
        int dsq = sq;

        scan.close();

        // Digit counting
        for (; sq > 0; sq /= 10) {
            digit++;
        }

        // Determining divisor = 10/100/1000....
        int div = (int) Math.pow(10, (digit - 1));

        System.out.printf("Square of %d is %d and it has %d digits, so it will be divided by %d.\n", num, dsq, digit,
                div);

        // Autopolymorphin checking
        if (digit == 1)
            System.out.println("Not Applicable");
        else if (dsq % div == num)
            System.out.printf("%d is a Autopolymorphin Number.\n", num);
        else
            System.out.printf("%d is NOT a Autopolymorphin Number.\n", num);

    }

}
