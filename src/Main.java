package src;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = getOffsetDateParse("2023-03-01T13:00:00Z");
        String formattedDate = getLongDate(date);
        System.out.println(formattedDate);
    }

    public static OffsetDateTime getOffsetDateParse(String date) {
        return OffsetDateTime.parse(date);
    }

    public static String getLongDate(OffsetDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }
}
