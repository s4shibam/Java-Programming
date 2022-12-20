// Print Name

import java.util.*;

public class Name_Output_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        System.out.println("Your Name is: " + scan.next());
        // scan.next() --> Takes only one word as an input (No space).

        scan.close();
    }
}
