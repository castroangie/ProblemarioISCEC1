import java.util.Scanner;

public class MarkRanges {
    public void get(Scanner sc){
        // Get input
        System.out.println("Enter a list of student marks from 0 to 10 separated by a comma (I.e.: 8.4, 8.3, 0): ");
        String input = sc.nextLine();

        // Convert String to float Array
        float[] m = convert(input);

        // Initialize range variables
        int rg_0_3 = 0;
        int rg_4_5 = 0;
        int rg_6_7 = 0;
        int rg_8_8p99 = 0;
        int rg_9_10 = 0;

        // Count marks in each range
        for (float j : m){
            if (j >= 0 && j <= 3.99){
                rg_0_3++;
            }
            else if (j >= 4 && j <= 5.99){
                rg_4_5++;
            }
            else if (j >= 6 && j <= 7.99){
                rg_6_7++;
            }
            else if (j >= 8 && j <= 8.99){
                rg_8_8p99++;
            }
            else if (j >= 9 && j <= 10){
                rg_9_10++;
            }
            else {
                System.out.println("'" + j + "' is not a valid mark.");
                return;
            }
        }

        // Print range counters
        System.out.println("0 to 3.99: " + rg_0_3);
        System.out.println("4 to 5.99: " + rg_4_5);
        System.out.println("6 to 7.99: " + rg_6_7);
        System.out.println("8 to 8.99: " + rg_8_8p99);
        System.out.println("9 to 10.99: " + rg_9_10);
    }

    // Convert String to float Array
    private float[] convert(String input){
        String[] m_tmp = input.split(",\\s*");
        float[] m = new float[m_tmp.length];

        try {
            for (int i = 0; i < m_tmp.length; i++){
                m[i] = Float.parseFloat(m_tmp[i]);
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid list of marks from 1 to 10.");
        }
        return m;
    }
}
