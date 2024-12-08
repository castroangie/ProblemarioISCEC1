import java.util.Scanner;

public class GetKeyboardData {
    public void PrintKeyboardData(Scanner sc) {
        System.out.println("What's your name?");
        String name = sc.nextLine();

        System.out.println("How old are you?");
        int age = sc.nextInt();

        System.out.println(name + " is " + age + " years old.");
    }
}
