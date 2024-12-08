import java.util.Scanner;

public class EmployeeReward {
    public void get(Scanner sc){
        // Get input
        System.out.println("Enter employee grade: ");
        float grade = sc.nextFloat();

        // Declare necessary variables
        float rew;
        String th;

        // Determine threshold
        if (grade == 0.0) {
            th = "Unacceptable";
        }
        else if (grade == 0.4) {
            th = "Acceptable";
        }
        else if (grade >= 0.6 && grade <= 1.0) {
            th = "Meritorious";
        }
        else {
            System.out.println("Please input a valid grade.");
            return;
        }

        rew = grade * 2400;

        System.out.println(th + "\n" + rew);
    }
}
