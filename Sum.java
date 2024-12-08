import java.util.Scanner;

public class Sum {
    // Only accept 5 numbers
    static final int LEN = 5;

    public static void get() {
        // Get numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert " + LEN + " numbers separated by a comma (1, 3, 5, 9, 10)");
        String[] n_tmp = sc.nextLine().split(",\\s*");
        int[] n = new int[LEN];

        // Validate only 5 numbers were inserted
        if (n_tmp.length != LEN) {
            System.out.println("Invalid input. Please insert 5 numbers.");
            sc.close();
            return;
        }

        try {
            // Cast strings to integers
            for (int i = 0; i < LEN; i++) {
                n[i] = Integer.parseInt(n_tmp[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter only numeric values.");
            sc.close();
            return;
        }

        // Sum all numbers
        int sum = 0;
        for (int i = 0; i < LEN; i++) {
            sum += n[i];
        }

        // Output result
        System.out.println(sum);

        // Close Scanner
        sc.close();
    }
}
