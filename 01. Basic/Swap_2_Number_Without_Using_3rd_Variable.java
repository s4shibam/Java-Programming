// Swap 2 numbers without using 3rd variable

import java.util.*;

public class Swap_2_Number_Without_Using_3rd_Variable {

    public static void main(String[] args) {

        int n1, n2;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number = ");
        n1 = scan.nextInt();
        System.out.print("Enter First Number = ");
        n2 = scan.nextInt();

        System.out.printf("Before Swapping:\n First number = %d\n Second Number = %d", n1, n2);

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.printf("After Swapping:\n First number = %d\n Second Number = %d", n1, n2);        

        scan.close();
    }
}
