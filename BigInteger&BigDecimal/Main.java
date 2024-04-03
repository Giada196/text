import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

//BigInteger
public class Main {
    public static void main(String[] args){
       BigDecimal num1 = new BigDecimal("10.5");
       BigDecimal num2 = new BigDecimal("2.9");
       Operazioni operazione = Operazioni.ADDIZIONE;
       BigDecimal totale = result(num1, num2, operazione);
        System.out.println("Numero1: " +  num1);
        System.out.println("Numero2: " + num2);
        System.out.println("Operazione " + operazione);
        System.out.println("Risultato " + totale);

    }
    public static BigDecimal result (BigDecimal num1, BigDecimal num2, Operazioni operazione){
        BigDecimal risultato = BigDecimal.ZERO;
        switch (operazione){
            case ADDIZIONE ->{
                risultato = num1.add(num2);
                 break;
        }
            case MOLTIPLICAZIONE -> {
                risultato = num1.multiply(num2);
                break;
            }
            case SOTTRAZIONE -> {
                risultato = num1.subtract(num2);
                break;
            }
            case DIVISIONE -> {
                risultato = num1.divide(num2, RoundingMode.HALF_EVEN);
                break;
            }
            case MAX -> {
                risultato = num1.max(num2);
                break;
            }
            case MIN -> {
                risultato = num1.min(num2);
                break;
            }
        }return risultato;

    }

}
