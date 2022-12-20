// Count digits of a number

import java.util.Scanner;

public class Digit_Counting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int num = scan.nextInt();
        int d = 0;
        scan.close();

        for (; num > 0; num /= 10) {

            ++d;
        }

        System.out.printf("Digit present in the number = %d", d);

    }
}