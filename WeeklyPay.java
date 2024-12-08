import java.util.Scanner;

public class WeeklyPay {
    public void get(Scanner sc){
        System.out.println("Enter hours: ");
        float hrs = sc.nextFloat();

        float limit = 40;
        float hr_rate = 35.25F;
        float over_rate =  hr_rate * 1.5F;

        if (hrs >= limit){
            float base = limit * hr_rate;
            float overtime = (hrs - limit) * over_rate;
            float pay = base + overtime;

            System.out.println("Weekly Pay: " + pay);
        }
        else
            System.out.println("Weekly Pay: " + (hrs * 16));
    }
}
