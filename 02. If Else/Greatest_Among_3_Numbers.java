// find greatest among 3 numbers

import java.util.*;

public class Greatest_Among_3_Numbers {

    public static void main(String[] args) {

        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        a = scan.nextInt();
        System.out.print("Enter 2nd number = ");
        b = scan.nextInt();
        System.out.print("Enter 3rd number = ");
        c = scan.nextInt();

        if (a > b) {
            if (a > c)
                System.out.printf("1st number %d is greatest", a);
            else
                System.out.printf("3rd number %d is greatest", c);

        }
        scan.close();
    }
}
