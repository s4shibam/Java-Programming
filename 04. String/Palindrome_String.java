import java.io.*;

public class Palindrome_String {

    public static void main(String[] args) throws IOException {

        int f = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String str = br.readLine();

        int len = str.length();
        len -= 1;

        for (int i = 0; i < len / 2; i++, len--) {

            if (str.charAt(i) != str.charAt(len)) {
                f = 1;
                break;
            }
        }

        if (f == 0)
            System.out.println("It is Palindrome String.");
        else
            System.out.println("It is not a Palindrome String.");
    }
}
