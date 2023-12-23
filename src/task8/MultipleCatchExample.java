package task8;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Код, который может вызвать исключение
            int[] array = new int[5];
            System.out.println(10/0);
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс вне диапазона: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Общее исключение: " + e.getMessage());
        }
    }
}