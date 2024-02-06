import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate date = LocalDate.now();
        return date.isAfter(startingDate) && date.isBefore(endingDate);
    }

    static boolean isDateBetween(LocalDate date, LocalDate startingDate, LocalDate endingDate) {
        return date.isAfter(startingDate) && date.isBefore(endingDate);
    }
}