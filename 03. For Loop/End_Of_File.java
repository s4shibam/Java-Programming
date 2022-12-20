// EOF - End of file

import java.util.*;

public class End_Of_File {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (sc.hasNext()) {

            i++;
            System.out.println(i + " " + sc.nextLine());
        }
        sc.close();
    }

}
