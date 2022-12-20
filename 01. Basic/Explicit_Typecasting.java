// Explicit Typecast

import java.util.*;

public class Explicit_Typecasting {

    public static void main(String[] args) {

        float num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        num1 = sc.nextFloat();
        System.out.print("Enter second number = ");
        num2 = sc.nextFloat();

        float mul = num1 * num2;
        System.out.println("Multiplication result = " + mul);

        // Float type variable typecast into Integer type variable
        int mul_int = (int) mul;
        System.out.println("Explicitly typecast Multiplication result = " + mul_int);

        sc.close();

    }
}
