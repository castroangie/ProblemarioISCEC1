import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConversion {
    public void calculateConversion(Scanner sc, DecimalFormat df){

        System.out.println("Enter the amount to convert in MXN: ");
        float q = sc.nextFloat();

        float r = q/19.41f;

        System.out.println("USD: $" + df.format(r) + ".");
    }
}
