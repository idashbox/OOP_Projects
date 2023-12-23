package task8;

public class TryFinallyExample {
    public static void main(String[] args) {
        try {
            // Код, который может вызвать исключение
            int result = 10 / 0;
        } finally {
            System.out.println("Этот блок будет выполнен в любом случае");
        }
    }
}