import java.text.DecimalFormat;
import java.util.Scanner;

public class Change {
    public void calculateChange(Scanner sc, DecimalFormat df){
        System.out.println("Enter item price: ");
        float pre = sc.nextFloat();

        System.out.println("Enter money received: ");
        float pag = sc.nextFloat();

        if (pre == pag) {
            System.out.println("No change.");
        }
        else if (pre > pag) {
            System.out.println("Insufficient funds.");
        }
        else {
            System.out.println("Change: " + df.format((pag - pre)));
        }
    }
}
