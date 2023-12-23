package task8;

public class MultiExceptionInCatchExample2 {
    public static void main(String[] args) {
        try {
            // Код, который может вызвать исключение
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
