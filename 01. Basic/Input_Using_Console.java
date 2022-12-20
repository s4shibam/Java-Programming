// Input using Console

public class Input_Using_Console {

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        String str = System.console().readLine();
        System.out.print("The string is: " + str);
    }
}
