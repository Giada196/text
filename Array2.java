/*Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri. 
Questo metodo dovrà poi stampare tutte le occorrenze del carattere a o 0 in caso non ce ne siano.*/
public class Array2 {
    public static void main(String args[]) {

        char[] chars = new char[5];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';
        chars[3] = 'd';
        chars[4] = 'e';

        char charToSearch = 'a';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            char itemI = chars[i];
            if (charToSearch == itemI) {
                count++;

            }

        }
        System.out.println(count);
    }
}