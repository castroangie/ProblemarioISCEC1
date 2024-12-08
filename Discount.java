import java.text.DecimalFormat;
import java.util.Scanner;

public class Discount {
    public void calculate(Scanner sc, DecimalFormat df) {
        System.out.println("Enter price: ");
        float price = sc.nextFloat();

        double discount = price * .20;
        double pay = price - discount;

        System.out.println("Discount: " + df.format(discount));
        System.out.println("To be Paid: " + df.format(pay));
    }
}
