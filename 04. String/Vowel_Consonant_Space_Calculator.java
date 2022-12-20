// Calculate the number of vowels, consonants and spaces from a given string

// Input:
// Output:

import java.io.*;

public class Vowel_Consonant_Space_Calculator {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String name = br.readLine();

        String vow = "", con = "";
        int vownum = 0, connum = 0, spnum = 0;
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
                    vow = vow + name.charAt(i) + " ";
                    vownum++;
                    break;
                case ' ':
                    spnum++;
                    break;
                default:
                    con = con + name.charAt(i) + " ";
                    connum++;
                    break;

            }
        }

        System.out.println("Number of Vowel: " + vownum);
        System.out.println("Vowels are: " + vow);
        System.out.println("Number of Consonant: " + connum);
        System.out.println("Consonants are: " + con);
        System.out.println("Number of Spaces: " + spnum);
    }
}
