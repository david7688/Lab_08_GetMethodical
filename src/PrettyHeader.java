import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {

        Scanner in  = new Scanner (System.in);

        String userInput = SafeInput.prettyHeader(in, "Enter your message");

        System.out.println(userInput);

    }

}

// WORK ON LATER
