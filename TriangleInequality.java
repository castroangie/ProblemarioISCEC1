import java.util.Scanner;

public class TriangleInequality {
    public void check(Scanner sc) {
        // Get lengths
        System.out.println("Insert 3 lengths separated by a comma (length 1, length 2, length 3): ");
        String[] lenTemp = sc.nextLine().split(",\\s*");

        // Check lengths are exactly 3
        if (lenTemp.length < 2) {
            System.out.println("Invalid lengths.");
            return;
        }

        // Convert lengths to integers
        float[] lengths = new float[lenTemp.length];

        for (int i = 0; i < lenTemp.length; i++) {
            lengths[i] = Float.parseFloat(lenTemp[i]);
        }

        // Separate into variables for readability
        float S1 = lengths[0];
        float S2 = lengths[1];
        float S3 = lengths[2];

        // Count equal sides
        int ctr = 0;

        // Store triangle type
        String triangle;

        // Check if lengths can form a triangle
        if ((S1 + S2) > S3 || (S2 + S3) > S1 || (S3 + S1) > S2) {
            // Increment ctr on each equal side
            for (float length : lengths) {
                if (length == S1) {
                    ctr++;
                }
            }
        }
        else {
            System.out.println("Lengths do not form a triangle.");
            return;
        }

        // Check triangle type
        triangle = switch (ctr) {
            case 1 -> "Scalene triangle.";
            case 2 -> "Isosceles triangle.";
            case 3 -> "Equilateral triangle.";
            default -> "Invalid lengths;";
        };

        System.out.println(triangle);
    }
}

