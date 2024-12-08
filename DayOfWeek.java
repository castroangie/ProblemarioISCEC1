import java.util.Scanner;

public class DayOfWeek {
    public void print(Scanner sc){
        System.out.println("Enter the number of a day in a week: ");
        int num = sc.nextInt();

        String day = switch (num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println(day);
    }
}
