public class Ifelse2 {
    public static void main(String args[]) {
        String name = "Entra? Non credo proprio!";

        System.out.println(name.length());
        if (name.length() < 10) {
            System.out.println("Lunghezza minore di 10");
        } else if (name.length() > 10) {
            System.out.println("Lunghezza maggiore di 10");
        } else if (name.length() == 10) {
            System.out.println("Lunghezza pari a 10");
        } else {
            System.out.println("Non è abbastanza lunga");
        }
    }

}
