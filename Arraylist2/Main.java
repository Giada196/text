/*
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main (String[] args){
        int n = 12;
    ArrayList<Student> studenti = new ArrayList<Student>(n);
        studenti.add(new Student("Vincenzo", 12));
        studenti.add(new Student("Emmanuele", 28));
        studenti.add(new Student("Giulia", 30));
        studenti.add(new Student("Kaori", 22));
        studenti.add(new Student("Ryo", 25));
        studenti.add(new Student("Ken", 17));
        studenti.add(new Student("Eren", 25));
        studenti.add(new Student("Naruto", 16));
        studenti.add(new Student("Hinata", 16));
        studenti.add(new Student("Gaara", 18));
        studenti.add(new Student("Sasuke", 18));
        studenti.add(new Student("Luffy", 20));
        studenti.add(new Student("Legoshi", 18));
        System.out.println(studenti);

        Collections.sort(studenti, Comparator.comparingInt(Student::getAge));
        System.out.println("Studenti in ordine di età:" + "\n" + studenti);


}
}
