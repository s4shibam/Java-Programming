// Age 18 or more for Adult else minor

import java.util.*;

public class Minor_Or_Adult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age <= 0)
            System.out.println("Error Input!!\n Age must be more than Zero(0).");

        else if (age >= 18)
            System.out.println(name + ", you are an Adult.");

        else
            System.err.println(name + ", you are a Minor.\n" + (18 - age) + " more years to become and Adult!!");

        sc.close();
    }
}
