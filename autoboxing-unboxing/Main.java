/* Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing
Usare le funzioni scritte con i valori creati*/
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 70;
        char a = 'a';
        Integer numero = 125;
        Integer numero1 = 170;
        Character b = 'A';
        // Valori primitivi
        int valorePrimitivoInt = 10;
        double valorePrimitivoDouble = 50;
        char valorePrimitivoChar = 70;

        somma(x, y);
        character(a);
        sommaOggetti(numero, numero1);
        characterObject(b);
        primitivi(valorePrimitivoInt, valorePrimitivoDouble, valorePrimitivoChar);

    }

    public static void somma(int x, int y) {
        System.out.println("La somma è: " + (x + y));
    }

    public static void character(char a) {
        System.out.println(a);
    }

    public static void sommaOggetti(Integer numero, Integer numero1) {
        System.out.println("Risultato: " + (numero + numero1));
    }

    public static void characterObject(Character b) {

        System.out.println(b);
    }

    public static void primitivi(int valorePrimitivoInt, double valorePrimitivoDouble, char valorePrimitivoChar) {
        System.out.println(
                "Valori primitivi: " + valorePrimitivoInt + " ;" + valorePrimitivoDouble + " ;" + valorePrimitivoChar);
        // Autoboxing
        Integer boxedInt = valorePrimitivoInt;
        Double boxedDouble = valorePrimitivoDouble;
        Character boxedChar = valorePrimitivoChar;
        // Unboxing
        int unboxedInt = boxedInt;
        double unboxedDouble = boxedDouble;
        char unboxedChar = boxedChar;
        System.out.println("Valori unboxed: " + unboxedInt + " ;" + unboxedDouble + " ;" + unboxedChar);
    }

}
