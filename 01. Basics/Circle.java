// Area, Perimeter of Circle

import java.util.*;

public class Circle {

    public static void main(String[] args) {

        double r, perimeter, area;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle (cm) = ");
        r = scan.nextInt();

        perimeter = 2 * 3.14 * r;
        area = 3.14 * r * r;

        System.out.printf("\nCircle:\n Perimeter = %f cm.\n Area = %f sq. cm.", perimeter, area);

        scan.close();
    }
}
