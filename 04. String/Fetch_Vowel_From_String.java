// Fetch the vowel from a given string and print as an output

// Input: Shibam Saha
// Output: iaaa

import java.io.*;

public class Fetch_Vowel_From_String {

    public static void main(String[] args) throws IOException {

        int vowel = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String name = br.readLine();

        System.out.print("Vowels: ");
        for (int i = 0; i < name.length(); i++) {

            switch (name.charAt(i)) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    System.out.printf("%c ", name.charAt(i));
                    vowel++;
                    break;

            }
        }
        System.out.println("\nTotal number of vowels present in the string is: " + vowel);

    }
}
