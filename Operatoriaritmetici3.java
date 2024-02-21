/* Definisci un metodo che calcoli la media tra 3 numeri e restituisca il risultato che dovrà essere stampato.
*/
public class Operatoriaritmetici3 {
    public static void main(String args[]) {
        int value = 9;
        int value2 = 8;
        int value3 = 10;
        System.out.println(media(value, value2, value3));
    }

    public static int media(int value, int value2, int value3) {
        return (value + value2 + value3) / 3;
    }
}