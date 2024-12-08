import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {
    public void get() {
        // Prompt user for input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman numeral: ");
        String s = sc.nextLine();

        // Initialize HashMap for Roman symbols and their integer values
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        // Initialize variable to store the resulting sum
        int sum = 0;

        // Iterate through the Roman numeral string
        for (int i = 0; i < s.length(); i++) {

            int n1 = roman.get(s.charAt(i));
            int n2 = 0;

            if (i != s.length() - 1) {
                n2 = roman.get(s.charAt(i + 1));
            }

            // Sum
            if (n1 >= n2) {
                sum += n1;
            }

            // Subtract
            else {
                switch (n1) {
                    case 1:
                        switch (n2) {
                            case 5:
                                sum += 4;
                                i++;
                                break;
                            case 10:
                                sum += 9;
                                i++;
                                break;
                        }
                    case 10:
                        switch (n2) {
                            case 50:
                                sum += 40;
                                i++;
                                break;
                            case 100:
                                sum += 90;
                                i++;
                                break;
                        }
                    case 100:
                        switch (n2) {
                            case 500:
                                sum += 400;
                                i++;
                                break;
                            case 1000:
                                sum += 900;
                                i++;
                                break;
                        }
                }
            }
        }
        System.out.println(sum);
    }
}
