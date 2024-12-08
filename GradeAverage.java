import java.util.Scanner;

public class GradeAverage {
    public void calculateAverage(Scanner sc){
        System.out.println("1st Period: ");
        float grade1 = sc.nextFloat();

        System.out.println("2nd Period: ");
        float grade2 = sc.nextFloat();

        float average = (grade1 + grade2)/2;

        if (average < 60) {
            System.out.println("Average: " + average + ". Student failed.");
        }
        else {
            System.out.println("Average: " + average + ". Student passed.");
        }
    }
}
