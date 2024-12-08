import java.util.Scanner;

public class IMC {
    public void get(Scanner sc) {
        // Read data
        System.out.print("Input your weight (kg): ");
        float w = sc.nextFloat();
        System.out.print("Input your height (m): ");
        float h = sc.nextFloat();

        // Calculate IMC
        float imc = w/(h*h);

        // Print IMC
        if (imc < 18.5) {
            System.out.println("IMC: low.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("IMC: normal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("IMC: overweight.");
        } else if (imc > 30) {
            System.out.println("IMC: obese.");
        } else {
            System.out.println("Invalid data.");
        }
    }
}
