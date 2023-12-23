package task11.color;

import java.time.LocalDate;

public class Color {
    public static String getColorCode(int expirationDateInt) {
        LocalDate currentDate = LocalDate.now();
        int currentDateInt = currentDate.getYear() * 10000 + currentDate.getMonthValue() * 100 + currentDate.getDayOfMonth();

        if (expirationDateInt < currentDateInt) {
            // Продукт просрочен - красный цвет
            return "\u001B[31m";
        } else {
            // Продукт свежий - зеленый цвет
            return "\u001B[32m";
        }
    }

    public static String colorizeText(String text, String colorCode) {
        return colorCode + text + "\u001B[0m";
    }
}
