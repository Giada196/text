/* Scrivi un programma che contiene un metodo che dati 2 interi in ingresso 
ed un valore di confronto verifichi se il numero di confronto è compreso tra due valori specifici 
e stampi il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore)*/
public class Operatorilogici {
    public static void main(String args[]) {
        int x = 16;
        int y = 22;
        int z = 18;

        boolean confronto = (x < z) && (y < z);
        System.out.println(confronto);
    }
}