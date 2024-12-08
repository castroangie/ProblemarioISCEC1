import java.util.Scanner;
import java.text.DecimalFormat;

public class CircleArea {
    public void calculateArea(Scanner sc, DecimalFormat df){

        System.out.println("Enter circle radius: ");
        double rad = sc.nextDouble();

        double a = Math.PI * Math.pow(rad, 2);
        double c = 2 * Math.PI * rad;

        System.out.println("Area: " + df.format(a) + ", circumference: " + df.format(c) + ".");
    }
}
