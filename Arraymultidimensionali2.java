/*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice
 e di scambiare le sue righe e le sue colonne stampandola a video.
 Matrice di partenza */
public class Arraymultidimensionali2 {
    public static void main(String args[]) {
        int[][] classi = { { 1, 2, 3 }, { 4, 5, 6 } };
        Scambiorighe(classi);
        Scambiorighe(NuovaMatrice(classi));
    }

    public static void Scambiorighe(int[][] classe) {
        for (int i = 0; i < classe.length; i++) {
            for (int k = 0; k < classe[i].length; k++) {
                System.out.println(classe[i][k]);
            }
            System.out.println(" ");
        }

    }

    public static int[][] NuovaMatrice(int[][] matrice) {
        int[][] matrice2 = new int[matrice[0].length][matrice.length];
        for (int i = 0; i < matrice.length; i++) {
            for (int k = 0; k <= matrice[i].length - 1; k++) {
                System.out.println(matrice2[k][i] = matrice[i][k]);

            }

        }
        return matrice2;
    }
}
