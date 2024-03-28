import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void controlloData() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(2023, dateTime.getYear());
        assertEquals(3, dateTime.getMonthValue());
        assertEquals(1, dateTime.getDayOfMonth());
        DateTimeFormatter date = DateTimeFormatter.ofPattern(dateTime.format(DateTimeFormatter.ofPattern("dd -MM -yyyy", Locale.ITALY)));
        String formattedDate = dateTime.format(date);
        assertEquals("01 -03 -2023", formattedDate);

    }
}