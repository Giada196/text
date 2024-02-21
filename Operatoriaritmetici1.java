/*Definisci un metodo per la divisione di 2 numeri interi che restituisca il resto che dovrà essere stampato. */

public class Operatoriaritmetici1 {
    public static void main(String args[]) {
        int x = 17;
        int y = 5;
        System.out.println(result(x, y));
    }

    public static int result(int x, int y) {
        return x % y;
    }
}