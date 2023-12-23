package task8;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            // Код, который может вызвать исключение
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e.getMessage());
        } finally {
            System.out.println("Этот блок будет выполнен в любом случае");
        }
    }
}