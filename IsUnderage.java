import java.util.Scanner;

public class IsUnderage {
    public void print(Scanner sc){
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("Adult.");
        else
            System.out.println("Underage.");
    }
}
