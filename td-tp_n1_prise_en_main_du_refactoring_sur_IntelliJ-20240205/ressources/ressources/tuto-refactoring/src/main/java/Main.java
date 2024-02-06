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
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate now = LocalDate.now();
        return isDateBetween(now, startingDate, endingDate);
    }

    private static boolean isDateBetween(LocalDate date, LocalDate startingDate, LocalDate endingDate) {
        return date.isAfter(startingDate) && date.isBefore(endingDate);
    }

    public static void main(String[] args) {
        new Main().add(1, 2);
        System.out.printf("Hello World");
    }
}


