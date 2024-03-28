import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testDataLong() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataStringLong = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        assertNotEquals(data, dataStringLong);
    }
}