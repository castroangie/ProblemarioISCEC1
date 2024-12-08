import java.util.Scanner;

public class ULAM {
    public void get(Scanner sc){
        // Get & validate input
        System.out.println("Enter a whole number bigger than 2: ");
        int n = 0;
        try {
            n = sc.nextInt();
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter a whole number.");
        }
        if (n < 1) {
            System.out.println("Please enter a number bigger than 2.");
            return;
        }

        // ULAM sequence
        while (n > 1){
            if (n % 2 == 0) {
                System.out.println(n);
                n = n / 2;
            } else {
                System.out.println(n);
                n = n * 3 + 1;
            }
        }

        System.out.println(n);
    }
}
