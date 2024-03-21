/*
Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata
 */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<Fruit> frutta = new LinkedList<>();
        frutta.add( new Fruit("Pompelmo"));
        frutta.add(new Fruit("Arancia"));
        frutta.add(new Fruit("Mango"));
        System.out.println(frutta);
        frutta.addFirst(new Fruit("Mandarino"));
        frutta.addLast(new Fruit("Durian"));
        System.out.println(frutta);

    }
}
