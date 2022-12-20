// Achromatic String

/*
Input: Shibam Saha
Output: S. S.
*/

import java.util.Scanner;

public class Achromatic_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        str = " " + str; // Adding space in front of the string

        int len = str.length();
        for (int i = 0; i < len; i++) {

            if (str.charAt(i) == ' ') {

                if (str.charAt(i + 1) >= 97 && str.charAt(i + 1) <= 122)
                    System.out.print((char) (str.charAt(i + 1) - 32) + ". ");

                else if (str.charAt(i + 1) >= 65 && str.charAt(i + 1) <= 90)
                    System.out.print((char) (str.charAt(i + 1)) + ". ");
            }
        }

        sc.close();
    }
}
