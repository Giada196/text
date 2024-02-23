/*Scrivere un programma che contenga un metodo che permetta di sostituire gli elementi duplicati in un array di interi con il valore -1. 
L'array ottenuto dovrà essere stampato a video. */

import java.util.Arrays;

public class Arrays3 {
    public static void main(String args[]) {
        int[] numeri = { 1, 2, 3, 4, 5, 6, -1, 7, -1, 8, -1, 9, 10, 6, 8, 7, 10, 11, 5 };
        TrovaDuplicati(numeri);
        System.out.println(Arrays.toString(numeri));
    }

    public static void TrovaDuplicati(int[] interi) {
        for (int i = 0; i < interi.length - 1; i++) {
            if (interi[i] != -1) {
                for (int k = i + 1; k < interi.length; k++) {
                    if (interi[k] == interi[i]) {
                        interi[k] = -1;

                    }
                }
            }
        }

    }
}
