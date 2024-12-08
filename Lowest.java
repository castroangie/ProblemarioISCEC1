import java.util.Scanner;

public class Lowest {
    public void print(){
        // Get input
        System.out.println("Enter 5 numbers separated by a comma (I.e.: 1, 4, 5, 6, 9): ");
        Scanner sc = new Scanner(System.in);
        String[] n_tmp = sc.nextLine().split(",\\s+");

        // Validate 5 numbers were entered
        if(n_tmp.length != 5){
            System.out.println("Please enter 5 numbers");
            return;
        }

        // Cast input to int
        final int N_LEN = 5;
        int[] n = new int[N_LEN];

        for (int i = 0; i < N_LEN; i++) {
            n[i] = Integer.parseInt(n_tmp[i]);
        }

        // Find & print greatest number
        int lowest = 0;
        for (int j : n) {
            if (lowest < j) {
                lowest = j;
            }
        }
        System.out.println(lowest);
    }
}
