/*Create la struttura, La popolate e poi implementate una ricerca nel set
 a partire da un valore di input, se lo trovate allora lo togliete dal set.
 Fate in modo di trovare tutti i valori con cui avete popolato il set in modo che rimanga vuoto.
A quel punto stampate il set per vedere che sia effettivamente vuoto.
 */
import java.util.HashSet;
import java.util.Iterator;

public class Hashset3 {
    public static void main(String[] args) {
        HashSet<String> auto = new HashSet<>();
        auto.add("Toyota");
        auto.add("Fiat");
        auto.add("Opel");

        System.out.println(auto);

        // Itera attraverso gli elementi del set utilizzando un iteratore
        Iterator<String> iterator = auto.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            // Effettua la ricerca e rimozione dell'elemento
            if (elemento.equals("Fiat")) {
                iterator.remove();
                System.out.println("Rimosso: " + elemento);
            }
        }

        // Verifica che il set sia vuoto
        System.out.println("Dopo la rimozione: " + auto);
    }
}