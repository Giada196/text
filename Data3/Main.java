import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main (String[] args){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int anno = data.getYear();
        int giornoDelMese = data.getDayOfMonth();
        int giornoDellAnno= data.getDayOfYear();
        DayOfWeek giornoDellaSettimana = data.getDayOfWeek();
        System.out.println("Anno: " + data.getYear());
        System.out.println("Giorno del mese: " + data.getDayOfMonth());
        System.out.println("Giorno dell'anno: " + data.getDayOfYear());
        System.out.println("Giorno della settimana:" + data.getDayOfWeek());

    }
}
