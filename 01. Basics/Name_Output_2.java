// Print Name

import java.util.*;

public class Name_Output_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        System.out.println("Your Name is: " + scan.nextLine());
        // scan.nextLine() --> Takes input until Enter key is pressed (Takes Spaces).

        scan.close();
    }
}
