public class Main {
public static void main (String [] args) {
    int[] numbers = {30, 60, 90};
    divisioneArray(numbers);
}

    public static void divisioneArray(int[] numbers) {
        try {
            for (int i = 0; i < numbers.length; i++) {
                int result = numbers[9] / 0;
                System.out.println("Result: " + result);
            }

        } catch (ArithmeticException e) {
            System.out.println("Error" + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index not found");

    }
}
}
