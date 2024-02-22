/* Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico 
e stampa tutti i numeri fino al valore immesso, 
la stampa dovrà saltare il valore uguale a 5.*/
public class Cicliavanzati2 {
    public static void main(String args[]) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

}
