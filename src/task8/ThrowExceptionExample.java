package task8;

public class ThrowExceptionExample {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Это исключение выброшено вручную");
        } catch (RuntimeException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}