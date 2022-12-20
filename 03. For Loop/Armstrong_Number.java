// Armstrong number - for 3 Digits

// Example - 153, 370, 371, 407, ...

// In the case of an Armstrong number of 3 digits, the sum of cubes of each digit is equal to the number itself.

import java.util.*;

public class Armstrong_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Armstrong number Checking:");
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        int rem, mul = 0;

        if (num > 99 && num < 1000) {

            for (int copy = num; copy > 0; copy = copy / 10) {

                rem = copy % 10;
                mul = mul + (int) (Math.pow(rem, 3));
            }
            if (num == mul)
                System.out.println(num + " is an Armstrong number");
            else
                System.out.println(num + " is NOT an Armstrong number");
        } else
            System.out.println("Error Input!!\nNumber should be within 3 digits only!!");

        sc.close();
    }
}
