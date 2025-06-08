package Task6;

public class Main6 {
    public static void main(String[] args) {
        double result1 = Calculator.sumAll(
                new Fraction2(3, 5),
                new Fraction2(23, 10),
                new Fraction2(10, 5)
        );
        System.out.printf("Результат 1: %.2f%n", result1);

        double result2 = Calculator.sumAll(
                new Fraction2(36, 10),
                new Fraction2(49, 12),
                new Fraction2(3, 1),
                new Fraction2(3, 2)
        );
        System.out.printf("Результат 2: %.2f%n", result2);

        double result3 = Calculator.sumAll(
                new Fraction2(1, 3),
                new Fraction2(1, 1)
        );
        System.out.printf("Результат 3: %.2f%n", result3);
    }
}