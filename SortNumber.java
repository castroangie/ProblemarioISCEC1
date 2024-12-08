import java.util.Scanner;

public class SortNumber {
    public void print(Scanner sc){
        // Get numbers
        System.out.println("First number: ");
        int first = sc.nextInt();
        System.out.println("Second number: ");
        int second = sc.nextInt();

        // Print ascending sort
        if (first < second){
            System.out.println(first + ", " + second);
        } else {
            System.out.println(second + ", " + first);
        }
    }
}
