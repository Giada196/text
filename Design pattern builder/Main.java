
/*Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici
 (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video*/
public class Main {
    public static void main (String[] args){
        PersonBuilder personBuilder1 = new PersonBuilder();
        Person person1 = personBuilder1
                .setFirstName("Giada")
                .setLastName("Fiorito")
                .setAge(27)
                .setAdress("Via thai")
                .build();
        System.out.println(person1);

    }
}
