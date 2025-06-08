package Task6;

public class Calculator {
    public static double sumAll(Number... values) {
        double sum = 0.0;
        for (Number value : values) {
            sum += value.doubleValue();
        }
        return sum;
    }
}
