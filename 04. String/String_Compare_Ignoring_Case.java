// Compare 2 strings and show the result that if it matches or not
// Note: Case ignored

// Input 1: Shibam      Input 2: shibaM
// Output: Matched

import java.io.*;

public class String_Compare_Ignoring_Case {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first string: ");
        String name1 = br.readLine();
        System.out.print("Enter the second string: ");
        String name2 = br.readLine();

        if (name1.equalsIgnoreCase(name2))
            System.out.println("Case Ignored: Both strings matched!!");
        else
            System.out.println("Strings NOT matched!!");
    }
}
