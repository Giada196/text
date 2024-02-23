/* Scrivi un programma che contiene un metodo che prenda un numero in ingresso 
e capisca se un numero è pari o dispari utilizzando solo gli operatori logici.*/
public class Operatorilogici2 {
    public static void main(String args[]) {
        int x = 17;
        System.out.println("Il valore è pari? " + paridispari(x));
    }

    public static boolean paridispari(int x) {
        return x % 2 == 0;
    }
}