// Check whether the character input is a vowel charcter or consonant

import java.io.*;

public class Check_Vowel_Or_Consonant {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a character: ");
        char x = (char) br.read();

        switch (x) {

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
                System.out.println("It is a vowel!!");
                break;
            default:
                System.out.println("It is a consonant!!");
        }
    }
}
