// Even or Odd

import java.util.*;

public class Even_Odd {

    public static void main(String[] args) {

        System.out.print("Enter the range = ");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();

        System.out.println("\tOdd\tEven");
        System.out.println("\t---\t----");

        scan.close();

        for (int i = 1; i <= r; i++) {
            if (i % 2 != 0)
                System.out.print("\t" + i);
            else
                System.out.println("\t" + i);
        }
    }
}
