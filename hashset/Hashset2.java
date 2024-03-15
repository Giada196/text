/*Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato*/


import java.util.HashSet;
    public class Hashset2 {
        public static void main (String[] args){
            System.out.println("Valori:" + riempiHashSet());
            for(String numeri : riempiHashSet()) {
            }
            System.out.println(riempiHashSet().contains("1"));
        }
        public static HashSet<String> riempiHashSet() {
            HashSet<String> riempiHashSet = new HashSet<>();

            riempiHashSet.add("1");
            riempiHashSet.add("2");
            riempiHashSet.add("3");

            return riempiHashSet;
        }


    }


