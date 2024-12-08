public class MemoryStorage {
    public void printDataTypes(){
        int whole = 23; // 4 bytes
        double decimal = 0.96; // 8 bytes
        char initial = 'A'; // 2 bytes
        boolean isMyBoyfriendCute = true; // 1 bit

        System.out.println(
                "Número entero: " + whole + "\n" +
                "Número decimal: " + decimal + "\n" +
                "Carácter: " + initial + "\n" +
                "Booleano: " + isMyBoyfriendCute + "\n"
        );
    }
}
