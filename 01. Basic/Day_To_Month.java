// Convert Day to Month

import java.util.*;

public class Day_To_Month {

    public static void main(String[] args) {

        int day, month;

        System.out.println("Convert Days into Month (Here, 1 Month = 30 Days)");
        System.out.print("Enter Days count = ");
        Scanner scan = new Scanner(System.in);
        day = scan.nextInt();

        month = day / 30;
        day = day % 30;

        System.out.printf("Result = %d Month(s) %d Day(s)", month, day);
        scan.close();

    }
}
