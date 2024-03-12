/*Scrivere una funzione che controlli se un numero int è in un determinato range.
 Se lo, è ritorna true ; se non lo è, lancia un'eccezione.
 */
public class Main {
    public static void main(String [] args) {
        int x = 10;
        try {
            boolean calcolaEtà = età(x);
            System.out.println("l'età è nel range");
         } catch (ArithmeticException e) {
        System.out.println("Errore: " + e);
    }
    }
    public static boolean età (int x){
            if (x >= 15) {
                return true;
            }else{
                throw new ArithmeticException("Errore");

        }
    }
}


