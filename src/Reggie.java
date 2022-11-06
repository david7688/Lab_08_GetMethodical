import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {

        Scanner in  = new Scanner (System.in);

        String menuChoice = "";

       String ssn = SafeInput.getRegExString(in, "Enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
       String mNum = SafeInput.getRegExString(in, "Enter your M Number M#####", "(M|m)\\d{5}");

       menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", "[OoSsVvQq]");

    }
}

