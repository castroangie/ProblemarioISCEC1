import java.util.Scanner;

public class SumFractions {
    public void get(Scanner sc){
        // Get input
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        // Initialize sum variable
        float sum = 0;

        // Add the division of 1 / n
        for (float i = 2; i <= n; i++) {
            sum += 1 / i;
        }

        // Print result
        System.out.println(sum);
    }
}
