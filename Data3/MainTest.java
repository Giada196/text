import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void controlloDate() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(2023, data.getYear());
        assertEquals(1, data.getDayOfMonth());
        assertEquals(DayOfWeek.WEDNESDAY, data.getDayOfWeek());

    }
}