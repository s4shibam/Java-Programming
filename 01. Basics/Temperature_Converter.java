// Convert Temperature Celsius to Fahrenheit

import java.util.*;

class Temperature_Converter {
    public static void main(String args[]) {

        float f, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the temperature in Celsius = ");
        c = scan.nextFloat();

        f = (((9 * c) / 5) + 32);

        System.out.println("\nTemperature in Fahrenheit = " + f + " F\n");

        scan.close();
    }
}
