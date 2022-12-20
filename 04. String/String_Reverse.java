import java.io.*;

public class String_Reverse {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String name = br.readLine();

        int len = name.length();

        for (int i = len - 1; i >= 0; i--) {

            System.out.print(name.charAt(i));
        }
    }
}
