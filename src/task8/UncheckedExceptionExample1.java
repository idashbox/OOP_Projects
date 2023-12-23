package task8;

// Непроверяемое исключение (unchecked exception)
class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}

// Использование непроверяемого исключения
public class UncheckedExceptionExample1 {
    public static void main(String[] args) {
        throw new MyUncheckedException("Это непроверяемое исключение");
    }
}