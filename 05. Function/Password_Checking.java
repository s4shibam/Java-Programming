import java.io.*;

public class Password_Checking {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String password = br.readLine();

        int sum = 0;
        int measure[] = { 0, 0, 0, 0 };

        if (password.length() < 8) {
            System.out.println("Your password is too short!!");
            return;
        }

        for (int i = 0; i < password.length(); i++) {

            // Number checking
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57)
                measure[0] = 1;

            // Uppercase Checking
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90)
                measure[1] = 1;

            // Lowercase Checking
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122)
                measure[2] = 1;

            // Special character Checking
            if (password.charAt(i) >= 32 && password.charAt(i) <= 47)
                measure[3] = 1;
            if (password.charAt(i) >= 58 && password.charAt(i) <= 64)
                measure[3] = 1;
            if (password.charAt(i) >= 91 && password.charAt(i) <= 96)
                measure[3] = 1;
            if (password.charAt(i) >= 123 && password.charAt(i) <= 126)
                measure[3] = 1;
        }

        for (int i = 0; i < 4; i++)
            sum += measure[i];

        if (sum == 4)
            System.out.println("Very Strong password!!");
        else if (sum == 3)
            System.out.println("Strong password!!");
        else if (sum == 2)
            System.out.println("Moderate password!!");
        else
            System.out.println("Very Easy password!!");
    }
}
