/*Scrivi un programma che contiene un metodo che che confronti due caratteri e determini se sono diversi.
Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza. */
public class Operatoricomparazione2 {
    public static void main(String args[]) {
        char x = 'A';
        char y = 'B';
        System.out.println(x);
        System.out.println(y);

        boolean charComparison = x != y;
        System.out.println("A è diverso da B? " + charComparison);
    }

}
