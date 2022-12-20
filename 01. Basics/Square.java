// Square Perimeter, Area

import java.util.*;

public class Square {

    public static void main(String[] args) {

        int side, area, perimeter;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the Square (Unit)= ");
        side = scan.nextInt();
        area = side * side;
        perimeter = 4 * side;

        System.out.printf("Area of the Square = %d Unit\n", area);
        System.out.printf("Perimeter of the Square = %d Sq. Unit", perimeter);

        scan.close();
    }
}
