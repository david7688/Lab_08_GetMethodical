import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args)
    {
        double prices[] = new double[100];
        int totalRecs = 0;
        double totalCost = 0;
        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        boolean gotAnother = true;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price ", .50, 9.99);
            prices[totalRecs] = itemPrice;
            totalCost += itemPrice;
            totalRecs++;
            gotAnother = SafeInput.getYNConfirm(in, "Got Another Item");

        }while(gotAnother);

        System.out.printf("Total Cost is %10.2f\n", totalCost);
    }
}
