/* Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e
 restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.*/
public class Ciclofor {

    public static void main(String[] args) {

        int tabellinaDel = 9;

        System.out.println("La tabellina del " + tabellinaDel + ", è...");

        for (int i = 1; i < 11; i++) {

            System.out.println(tabellinaDel + " x " + i + " = " + tabellinaDel * i);
        }
    }
}
