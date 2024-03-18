package src;

import org.junit.jupiter.api.Test;
import src.Main;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    @Test
    public void testGetOffsetDateParse() {
        String date = "2023-03-01T13:00:00Z";
        OffsetDateTime expectedDate = OffsetDateTime.parse(date);
        OffsetDateTime actualDate = Main.getOffsetDateParse(date);
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testGetOffsetDateParseInvalid() {
        String invalidDate = "Invalid";
        assertThrows(DateTimeException.class, () -> Main.getOffsetDateParse(invalidDate));
    }

    @Test
    public void testGetLongDate() {

        OffsetDateTime testDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String expectedDate = testDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String date = Main.getLongDate(testDate);
        assertEquals(expectedDate, date);
    }


}