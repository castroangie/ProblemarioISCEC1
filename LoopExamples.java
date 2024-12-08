public class LoopExamples {
    public void ex(){
        int count = 0;

        // While
        while (count < 3) {
            System.out.println("Count is: " + count);
            count++;
        }

        //Do while
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 3);

        // For
        for (int i = 0; i < 3; i++) {
            System.out.println("i is: " + i);
        }
    }
}
