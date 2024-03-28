import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testDataFull() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dataStringFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        assertNotEquals(data, dataStringFull);
    }
    @Test
    void testDataLong(){
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dataStringLong = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        assertNotEquals(data, dataStringLong);

    }
    @Test
    void testDataMedium(){
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dataStringMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        assertNotEquals(data, dataStringMedium);

    }
    @Test
    void testDataShort(){
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dataStringShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        assertNotEquals(data, dataStringShort);
    }


}