// Add 2 Numbers

import java.util.*;

class Addition {
    public static void main(String add[]) {
        int a, b;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the First number = ");
        a = ob.nextInt();
        System.out.print("Enter the Second number = ");
        b = ob.nextInt();
        System.out.println("Addition = " + (a + b));

        ob.close();
    }

}
