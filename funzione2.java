//Definire una funzione che accetti in ingresso una stringa e ne restituisca la lunghezza//
public class funzione2 {
    public static void main(String args[]) {
        String name = "Giada";

        System.out.println("La lunghezza è: " + lunghezza(name));
    }

    public static int lunghezza(String name) {
        return name.length();
    }

}