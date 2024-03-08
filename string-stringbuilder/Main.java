public class Main {

    public static void main(String[] args) {
        String primaStringa = "Hello";
        String secondaStringa = "World";

        String risultatoConfronto = confrontaStringhe(primaStringa, secondaStringa);

        System.out.println(risultatoConfronto);
    }

    public static String confrontaStringhe(String stringa1, String stringa2) {
        int confronto = stringa1.compareTo(stringa2);

        StringBuilder risultato = new StringBuilder("Le due stringhe sono ");

        if (confronto == 0) {
            risultato.append("uguali");
        } else {
            risultato.append("differenti");
        }

        return risultato.toString();
    }
}