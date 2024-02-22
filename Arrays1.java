/*Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10
 e che che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video. */

public class Arrays1 {
    public static void main(String args[]) {
        int[] numeri = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int i = 0; i < numeri.length; i++) {
            sum = numeri[i] + sum;

        }
        System.out.println(sum);
    }
}
