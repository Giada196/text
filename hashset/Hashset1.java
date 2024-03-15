/*Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi*/

import java.util.HashSet;

public class Hashset1{
    public static HashSet<String> riempiHashset(){
        HashSet<String> riempimento = new HashSet<>();

        riempimento.add("1");
        riempimento.add("2");
        riempimento.add("3");

        return riempimento;


    }
    public static void main(String[] args){
        HashSet<String> riempimento = riempiHashset();
        System.out.println("Valori:" + riempimento);
    }
}