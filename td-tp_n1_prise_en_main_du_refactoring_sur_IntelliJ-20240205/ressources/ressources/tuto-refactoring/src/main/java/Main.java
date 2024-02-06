import java.time.LocalDate;

public class Main {
    /**
     * Adds a and b
     * @param firstNumber the first number
     * @param b the second number
     */
    public int add(int firstNumber, int b) {
        return firstNumber + b;
    }

    public static void main(String[] args) {
        new Main().add(1, 2);
        DateUtils.isNowBetween(LocalDate.MIN, LocalDate.MAX);
        DateUtils.isDateBetween(LocalDate.of(2024, 2, 6), LocalDate.MIN, LocalDate.MAX);
        System.out.printf("Hello World");
    }
}


