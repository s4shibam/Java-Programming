// Simple Interest

import java.util.*;

public class Simple_Interest {

    public static void main(String[] args) {

        int p, roi, t, si;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount = ");
        p = sc.nextInt();
        System.out.print("Enter Rate of Interest (in %) = ");
        roi = sc.nextInt();
        System.out.print("Enter Time (in Years) = ");
        t = sc.nextInt();

        si = (p * roi * t) / 100;

        System.out.printf("Simple Interest = %d\n", si);
        System.out.printf("Total Amount = %d", p + si);

        sc.close();

    }
}