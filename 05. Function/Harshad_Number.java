// An integer number in base 10 which is divisible by the sum of its digits is said to be a Harshad Number.

import java.io.*;

// User defined function
class Function {
    public int sum;
    public int rem;

    public void Harshad_Function(int x) {

        int num = x;
        for (; x > 0; x /= 10) {
            rem = x % 10;
            sum += rem;
        }
        if (num % sum == 0)
            System.out.println(num + " is a Harshad Number.");
        else
            System.out.println(num + " is NOT a Harshad Number.");
    }
}

// Main Function
public class Harshad_Number {

    public static void main(String[] args) throws IOException {

        System.out.print("Enter any number = ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Function fn = new Function();
        fn.Harshad_Function(num);
    }
}
