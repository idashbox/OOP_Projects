package task8;

// Проверяемое исключение (checked exception)
class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}

// Использование проверяемого исключения
public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyCheckedException("Это проверяемое исключение");
        } catch (MyCheckedException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}