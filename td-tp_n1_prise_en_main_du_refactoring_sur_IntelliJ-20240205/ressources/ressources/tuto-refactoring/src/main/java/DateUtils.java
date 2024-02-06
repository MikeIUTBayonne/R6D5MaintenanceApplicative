import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate now = LocalDate.now();
        return isDateBetween(now, startingDate, endingDate);
    }

    static boolean isDateBetween(LocalDate date, LocalDate startingDate, LocalDate endingDate) {
        return date.isAfter(startingDate) && date.isBefore(endingDate);
    }
}