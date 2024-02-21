/* Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore 
scelto da te e le moltiplichi fra di loro.
Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.*/
public class Operatoriassegnazione {
    public static void main(String args[]) {
        int x = 10;
        int y = 15;
        x += 2;
        y += 2;
        System.out.println(result(x, y));
    }

    public static int result(int x, int y) {
        return x * y;

    }
}
