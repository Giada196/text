/*Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.*/
public class Main {
    public static void main (String [] args){
        int numeratore = 2;
        int divisore = 0;
        try{
           int risultato = divisione(numeratore, divisore);
            System.out.println("Divisione" + risultato);
        }
        catch (ArithmeticException e) {
            System.out.println("Errore" + e);

        }
    }
    public static int divisione (int numeratore, int divisore){
        if(divisore == 0){
            throw new ArithmeticException("Non si può dividere");
        } else {
            return numeratore/divisore;
        }
    }

}
