// Command Line Argument

public class Command_Line_Argument {

    public static void main(String[] args) {

        if (args.length > 0) {

            System.out.println("The command line arguments are: ");
            for (String word : args)
                System.out.println(word);
        } else
            System.out.println("No command line arguments are found!!");
    }
}
