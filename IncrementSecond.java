import java.util.Scanner;

public class IncrementSecond {
    public void print(Scanner sc){
        // Get time
        System.out.println("Enter the time (hh:mm:ss): ");
        String input = sc.nextLine();

        // Separate into hours, minutes and seconds
        String[] timeTemp = input.split(":");
        int[] time = new int[timeTemp.length];

        // Convert to numbers
        for(int i = 0; i < time.length; i++) {
            time[i] = Integer.parseInt(timeTemp[i]);
        }

        // Validate input
        if (validate(time)){
            System.out.println("Invalid time.");
            return;
        }

        // Increment time > time[0] == hours, time[1] == minutes, time[2] == seconds
        if (time[2] < 59){
            time[2]++;
        }
        else if (time[1] < 59){
            time[1]++;
            time[2] = 0;
        }
        else if (time[0] < 23) {
            time[0]++;
            time[1] = 0;
            time[2] = 0;
        }
        else {
            time[0] = 0;
            time[1] = 0;
            time[2] = 0;
        }

        // Print result
        String formattedTime = String.format("%02d:%02d:%02d", time[0], time[1], time[2]);
        System.out.println(formattedTime);
    }

    public boolean validate(int[] time){
        return time.length != 3 || (time[0] > 23 || time[1] > 59 || time[2] > 59);
    }
}
