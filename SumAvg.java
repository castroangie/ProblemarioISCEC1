import java.util.Scanner;

public class SumAvg {
    public void get(Scanner sc){
        // Get input
        System.out.println("Enter a list of whole numbers separated by a comma (I.e.: 1, 2, 3): ");
        String input = sc.nextLine();

        // Get converted int Array
        int[] n = convert(input);

        // Initialize variables
        int e_sum = 0;
        int o_sum = 0;
        int o_avg = 0;

        int o_ctr = 0;

        // Add even or odd numbers
        for (int j : n) {
            if (j % 2 == 0) {
                e_sum += j;
            } else {
                o_sum += j;
                o_ctr++;
            }
        }

        // Find average of odd sum
        o_avg = o_sum / o_ctr;

        // Print result
        System.out.println("Even sum: " + e_sum);
        System.out.println("Odd average: " + o_avg);
    }

    // Cast String input to an int Array
    private int[] convert(String input){
        String[] n_tmp = input.split(",\\s*");
        int[] n = new int[n_tmp.length];

        try {
            for (int i = 0; i < n_tmp.length; i++){
                n[i] = Integer.parseInt(n_tmp[i]);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Please enter a list of valid whole numbers.");
        }
        return n;
    }
}
