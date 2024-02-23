public class Arraysmultidimensionali1 {

    public static void main(String args[]) {
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int sommaPrimaRiga = sommaPrimaRiga(myNumbers);
        System.out.println("Somma degli elementi sulla prima riga: " + sommaPrimaRiga);
    }

    public static int sommaPrimaRiga(int[][] matrice) {
        int somma = 0;
        for (int elemento : matrice[0]) {
            somma += elemento;
        }

        return somma;
    }
}
