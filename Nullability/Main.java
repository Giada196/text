public class Main {
    public static void main(String[] args) {
        Integer numeratore = 1;
        Integer denominatore = 2;
        try {
            int risultato = divisione(numeratore, denominatore);
            System.out.println("Il risultato è: " + risultato);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divisione(Integer numeratore, Integer denominatore) {
        if (numeratore == null & denominatore == null) {
            throw new IllegalArgumentException("Input error");
        } else if (denominatore == 0) {
            throw new ArithmeticException("Error");
        }
        return numeratore / denominatore;

    }
}