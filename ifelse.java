/* Scrivere un programma che stampi i numeri da 1 a 100. Per i multipli di 3 stampi "Fizz" al posto del numero 
e per i multipli di 5 stampi "Buzz".
Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".*/
public class ifelse {
    public static void main(String arg[]) {
        int x = 30;

        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (x % 3 == 0) {
            System.out.println("Fizz");
        } else if (x % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("ha ha");
        }
    }

}
