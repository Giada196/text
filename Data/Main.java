import org.w3c.dom.ls.LSOutput;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//import java.time.OffsetDateTime;
//import java.time.ZoneOffset;

/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni -Crea dei test per questo esercizio */

public class Main {
  public static void main(String[] args) {
      OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
      String dataStringFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
      System.out.println(dataStringFull);

      String dataStringLong = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
      System.out.println(dataStringLong);

      String dataStringMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
      System.out.println(dataStringMedium);
      
      String dataStringShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
      System.out.println(dataStringShort);

  }

}