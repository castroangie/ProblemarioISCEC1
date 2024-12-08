import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {
    static final int LEN = 5;

    public static void get() {
        System.out.println("Insert " + LEN + " numbers separated by a comma (e.g., 1, 4, 3, 5, 6)");
        Scanner sc = new Scanner(System.in);
        String[] n_tmp = sc.nextLine().split(",\\s*");

        if (n_tmp.length != LEN) {
            System.out.println("Invalid input. Please input " + LEN + " numbers separated by a comma.");
            sc.close();
            return;
        }

        ArrayList<Integer> n = new ArrayList<>();
        try {
            for (String num : n_tmp) {
                n.add(Integer.parseInt(num));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please input " + LEN + " numbers separated by commas.");
            sc.close();
            return;
        }

        // Create arrays to store divisors
        ArrayList<Integer>[] divisors = new ArrayList[LEN];
        for (int i = 0; i < LEN; i++) {
            divisors[i] = new ArrayList<>();
        }

        // Check for divisors
        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {
                if (n.get(i) % n.get(j) == 0) { // Check if n[j] is a divisor of n[i]
                    divisors[i].add(n.get(j));
                }
            }
        }

        // Display the divisors for each number
        for (int i = 0; i < LEN; i++) {
            System.out.println("Divisors of " + n.get(i) + ": " + divisors[i]);
        }

        sc.close();
    }

}