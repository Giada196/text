/* Scrivere un programma che contenga un metodo che sfrutti il while loop 
e prenda in ingresso 1 valore intero come limite superiore e calcoli la somma di tutti i valori prima del limite e la stampi a video.
(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)
*/

public class CicloWhile {
    public static void main(String args[]) {
        int x = 0;
        int sum = 0;

        while (x <= 5) {
            System.out.println(x);
            x++;
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
