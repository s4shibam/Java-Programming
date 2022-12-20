// Short name and full title

// Input: Shibam Kumar Saha
// Output: S. K. Saha

import java.io.*;

public class Short_Name_Full_Title {

    public static void main(String[] args) throws IOException {

        int i, j = 0;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the string: ");
        String name = br.readLine(); // Input

        // Manually printing the very first letter of the first word in capital cas
        // (Name)
        if (name.charAt(0) >= 97 && name.charAt(0) <= 122)
            System.out.print(((char) (name.charAt(0) - 32)));
        else
            System.out.print(((char) (name.charAt(0))));

        // For the rest of the words (Middle Name) till the first letter of title
        for (i = 1; i < name.length(); i++) {

            if (name.charAt(i) == ' ') {

                if (name.charAt(i + 1) >= 97 && name.charAt(i + 1) <= 122)
                    System.out.print(". " + ((char) (name.charAt(i + 1) - 32)));

                else
                    System.out.print(". " + ((char) (name.charAt(i + 1))));

                j = i + 2;
            }
        }

        // Prints the whole last word except the first letter (Title)
        for (; j < name.length(); j++) {
            if (name.charAt(j) >= 65 && name.charAt(j) <= 90)
                System.out.print((char) (name.charAt(j) + 32));
            else
                System.out.print((char) (name.charAt(j)));
        }

    }

}
