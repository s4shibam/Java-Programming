// A number is said to be a magic number, if the sum of its digits are calculated till a single digit recursively by adding the sum of the digits after every addition.
// If the single digit comes out to be 1, then the number is a Magic Number.

import java.io.*;

public class Magic_Number {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a Number: ");

        int num = Integer.parseInt(br.readLine());

        int sum = 0, rem;

        do {
            for (; num > 0; num /= 10) {
                rem = num % 10;
                sum += rem;
            }
            num = sum;
            sum = 0;
        } while (num > 9);

        if (num == 1)
            System.out.println("It is a Magic Number.");
        else
            System.out.println("It is Not a Magic Number.");

    }

}
