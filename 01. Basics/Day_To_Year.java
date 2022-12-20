// Convert Day to Year

import java.util.*;

public class Day_To_Year {

    public static void main(String[] args) {

        int day, month, year;

        System.out.println("Convert Days into Month (Here, 1 Month = 30 Days)");
        System.out.print("Enter Days count = ");
        Scanner scan = new Scanner(System.in);
        day = scan.nextInt();

        year = day / 365; // Dividing day count by 365 to get year
        day = day % 365; // Taking reminder after dividing day count by 365 as an input for day

        // Now year count part is extracted from day count now

        month = day / 30; // Dividing the updated day by 30 helps to get month
        day = day % 30; // Taking reminder as an input for day

        System.out.printf("Result = %d Year(s) %d Month(s) %d Day(s)", year, month, day);
        scan.close();

    }
}
