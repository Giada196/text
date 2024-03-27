import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*Crea un oggetto data da questa stringa
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia*/
public class Main {
    public static void main (String[] args){
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        dateTime = dateTime.plusYears(1);
        dateTime = dateTime.minusMonths(1);
        dateTime = dateTime.minusDays(7);
        dateTime.format(DateTimeFormatter.ofPattern("dd -MM -yyyy", Locale.ITALY));
        System.out.println(dateTime);
    }
}
