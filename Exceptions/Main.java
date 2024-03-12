public class Main {
      public static void main(String []args){
                char x = 'A';
                controllaCarattere(x);
      }
      public static void controllaCarattere(char x){
          if(Character.isDigit(x)){
              System.out.println("Numero" + x);
          }else {
              throw new ArithmeticException("Non è un numero");
          }
      }
}
