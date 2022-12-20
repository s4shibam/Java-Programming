// String Functions
// Append, Insert, Replace, Delete, Substring

import java.io.*;

public class String_Functions {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a name: ");
        String name = br.readLine();
        StringBuffer sb = new StringBuffer(name);

        System.out.print("\nOriginal String: " + sb);
        System.out.println("\nCurrent string length: " + sb.length());

        System.out.print("\nEnter title: ");
        String title = br.readLine();
        sb.append(" " + title);
        System.out.println("Result: " + sb);
        System.out.println("Current string length: " + sb.length());

        System.out.print("\nEnter a middle name: ");
        String mname = br.readLine();
        sb.insert(6, " " + mname);
        System.out.println("Result: " + sb);
        System.out.println("Current string length: " + sb.length());

        System.out.print("\nReplace name with: ");
        String newname = br.readLine();
        sb.replace(0, (name.length()), newname);
        System.out.println("Result: " + sb);
        System.out.println("Current string length: " + sb.length());

        System.out.print("\nAfter Deleting Middle name: ");
        sb.delete((newname.length()), (newname.length() + mname.length()) + 1);
        System.out.println("\nResult: " + sb);
        System.out.println("Current string length: " + sb.length());

        System.out.print("\nSubstring (from 5th index to last index): ");
        System.out.println("\nResult: " + sb.substring(5));

        System.out.print("\nSubstring (2nd index to (6-1)=5th index): ");
        System.out.println("\nResult: " + sb.substring(2, 6));

    }
}
