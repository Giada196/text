/* Definisci un metodo per la divisione di 3 numeri interi che restituisca il risultato che dovrà essere stampato*/
public class Operatoriaritmetici2 {
    public static void main(String args[]) {
        int x = 60;
        int y = 5;
        int z = 2;
        System.out.println(result(x, y, z));
    }

    public static int result(int x, int y, int z) {
        return (x / y) / z;
    }
}