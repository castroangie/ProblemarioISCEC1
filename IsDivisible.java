import java.util.Scanner;

public class IsDivisible {
    public void check(Scanner sc) {
        // Get user input
        System.out.println("Enter a dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter a divisor: ");
        int divisor = sc.nextInt();

        // Convert to string
        String result = Float.toString(dividend / (float) divisor);

        // Split to get decimals
        String[] decimal = result.split("\\.");

        // Check for a decimal greater than 0
        if (validate(decimal)){
            System.out.println("Divisible");
        } else
            System.out.println("Not divisible");

        return;
    }

    public boolean validate(String[] decimal) {
        for (int i = 0; i < decimal[1].length(); i++) {
            if (decimal[1].charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }
}
