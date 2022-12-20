// Clock - Time to Statement

import java.util.*;

public class Clock {

    void isValid(int hour, int minute) {

        // Checks whether the time input is valid or not
        if (hour < 1 || hour > 12 || minute < 0 || minute > 59) {
            System.out.println("Invalid Input!!");
            return;
        } else
            clockOutput(hour, minute); // Function called to get time output in words

    }

    void clockOutput(int hour, int minute) {

        // *Hours Declaration
        String hourWord[] = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                "Twelve", "One" };

        // *Minutes Declaration
        String minuteWord[] = { "O'Clock", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Quarter", "Sixteen", "Seventeen", "Eighteen",
                "Nineteen", "Twenty", "Twenty-one", "Twenty-two", "Twenty-three", "Twenty-four", "Twenty-five",
                "Twenty-six", "Twenty-seven", "Twenty-eight", "Twenty-nine", "Half" };

        if (minute == 0)
            System.out.printf("Time is: %d : %d%d\n", hour, minute, minute);
        else
            System.out.printf("Time is: %d : %d\n", hour, minute);

        // Prints Clock Timing in words

        // *Specific Condition for minute input "00"
        if (minute == 0)
            System.out.printf("In word: It is %s %s.", hourWord[hour - 1], minuteWord[minute]);

        // *Specific Condition for minute input "15" or "30"
        else if (minute == 15 || minute == 30)
            System.out.printf("In word: It is %s past %s.", minuteWord[minute], hourWord[hour - 1]);

        // *Specific Condition for minute input "45"
        else if (minute == 45)
            System.out.printf("In word: It is %s to %s.", minuteWord[(60 - minute)], hourWord[hour]);

        // *Minute input lesser than "30"
        else if (minute < 30)
            System.out.printf("In word: It is %s Minutes past %s.", minuteWord[minute], hourWord[hour - 1]);

        // *Minute input greater than "30"
        else
            System.out.printf("In word: It is %s Minutes to %s.", minuteWord[(60 - minute)], hourWord[hour]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-- CLOCK --\n");
        System.out.print("Enter Hour(s): ");
        int hour = sc.nextInt();
        System.out.print("Enter Minute(s): ");
        int minute = sc.nextInt();
        sc.close();

        Clock clock = new Clock();
        clock.isValid(hour, minute); // Function called to check input validity

    }
}
