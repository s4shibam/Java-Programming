// Reverse the title of a name and print it then print the name normally.

// Input: Shibam Saha
// Output: ahaS Shibam

import java.io.*;

public class Reverse_The_Title {

    public static void main(String[] args) throws IOException {

        String name;
        int i = 0, c = 0;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the name = ");
        name = br.readLine();

        // Moving the cursor to the end of the string length.
        while (i < name.length()) {
            i++;
        }

        for (i = i - 1; (name.charAt(i)) != ' '; i--) {

            System.out.print(((char) name.charAt(i)));

            // Storing the index of very last space in c.
            c = i - 1;
        }

        // Manual space printing after the very last word has been printed in reverse
        // order.
        System.out.print(" ");

        // Print front part in original order till before the very last space.
        for (i = 0; i < c; i++) {

            System.out.print(((char) name.charAt(i)));
        }

    }
}
