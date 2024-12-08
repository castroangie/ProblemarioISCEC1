import java.util.Scanner;

public class Min {
    static final int LEN = 5;
    public static void get(){
        System.out.println("Insert " + LEN + " numbers separated by a comma (1, 4, 3, 5, 6)");
        Scanner sc = new Scanner(System.in);
        String[] n_tmp = sc.nextLine().split(",\\s*");

        int[] n = new int[LEN];

        if (n_tmp.length != LEN) {
            System.out.println("Invalid input. Please input " + LEN + " numbers separated by a comma.");
            sc.close();
            return;
        }

        try {
            for (int i = 0; i < LEN; i++) {
                n[i] = Integer.parseInt(n_tmp[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please input " + LEN + " numbers separated by comma.");
            return;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < LEN; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }

        System.out.println(min);
        sc.close();
    }
}
