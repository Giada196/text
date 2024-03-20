/*
Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] args){
        int n = 5;
        ArrayList<Student> studenti = new ArrayList<>(n);
        System.out.println(studenti);


        studenti.add(new Student("Vincenzo", 12));
        studenti.add(new Student("Emmanuele", 28));
        studenti.add(new Student("Giulia", 30));
        studenti.add(new Student("Kaori", 22));
        System.out.println("Studenti: " + studenti);


        }


    }
