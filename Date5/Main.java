/*Crea un oggetto data da questa stringa
Crea un secondo oggetto data da questa stringa
Verificare che la prima data è precedente alla seconda
Verificare che la seconda data è successiva alla prima
Verificare che le due date sono uguali ad ora
Stampa il risultato*/

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args){
        OffsetDateTime datatime1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime datatime2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        boolean dataPrecedente = datatime1.isBefore(datatime2);
        boolean dataSuccessiva = datatime2.isAfter(datatime1);
        boolean dateuguali = datatime1.equals(datatime2);
        System.out.println("La prima data è precedente alla seconda? " + dataPrecedente);
        System.out.println("La seconda data è successiva alla prima? " + dataSuccessiva);
        System.out.println("Le due date sono uguali? " + dateuguali);
    }
}
