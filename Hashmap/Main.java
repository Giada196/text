/*
Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata
 */

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Fruit frutta = new Fruit("Pompelmo");
        Fruit frutta1 = new Fruit("Mandarino");
        Fruit frutta2  = new Fruit("Melograno");

        Map<String, Fruit> listaFrutta = new HashMap<>();
        listaFrutta.put("Frutto giallo:", frutta);
        listaFrutta.put("Frutto arancione: ", frutta1);
        listaFrutta.put("Frutto rosso: ", frutta2);
        System.out.println(listaFrutta);

        Map<String, Fruit> listaFrutta2 = Map.of("Frutto giallo: ", frutta,"Frutto arancione: ", frutta1,"Frutto rosso: ", frutta2);
        System.out.println(listaFrutta2);

        Map<String, Fruit> listafrutta3 =Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Frutto giallo: ", frutta),
                new AbstractMap.SimpleEntry<>("Frutto arancione: ", frutta1),
                new AbstractMap.SimpleEntry<>("Frutto rosso: ", frutta2)

        );
        System.out.println(listafrutta3);
        System.out.println(listafrutta3.get("Frutto giallo: "));
}
}
