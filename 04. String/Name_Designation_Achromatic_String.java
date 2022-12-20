// Enter Name and Designation and print output using Achromatic string format on Designation along with name

import java.io.*;

public class Name_Designation_Achromatic_String {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String desg, name, lvl, x;
        x = "";
        System.out.print("Enter your name = ");
        name = br.readLine();
        System.out.print("Enter expected Designation = ");
        desg = br.readLine();
        desg = " " + desg;
        System.out.print("Enter Designation Level = ");
        lvl = br.readLine();

        for (int i = 0; i < desg.length(); i++) {
            if ((char) (desg.charAt(i)) == ' ') {
                if (desg.charAt(i + 1) >= 97 && desg.charAt(i + 1) <= 122)
                    x = x + ((char) (desg.charAt(i + 1) - 32) + ".");
                else if (desg.charAt(i + 1) >= 65 && desg.charAt(i + 1) <= 90)
                    x = x + ((char) (desg.charAt(i + 1)) + ".");

            }
        }

        System.out.println("Mr. " + name + " (" + x + " " + lvl + ")");
    }
}
