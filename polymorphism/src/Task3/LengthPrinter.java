package Task3;

public class LengthPrinter {
    public static void printLengths(Measurable... objects) {
        for (Measurable obj : objects) {
            System.out.println("Длина: " + obj.getLength());
        }
    }
}
