/*Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode in un indice specifico all'interno di una stringa e lo stampi.
Il metodo dovrà avere nel costruttore una stringa ed una posizione e dovrà resituire il carattere in unicode o una stringa di errore.
Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
*/

public class Main {
    public static void main(String[] args) {
        String unicode = "\u004C \u0065 \u006C \u0065";
        int position = 2;
        String result = index(unicode, position);
        System.out.println(result);
    }

    public static String index(String unicode, int position) {

        StringBuilder result = new StringBuilder("Risultato: ");

        if (position <= unicode.length()) {
            char charAtIndex = unicode.charAt(position);
            result.append("Il carattere in Unicode all'indice ").append(position).append(" è: ").append(charAtIndex);
        } else {
            return "Error";

        }
        return result.toString();
    }
}