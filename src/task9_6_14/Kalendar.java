package task9_6_14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Kalendar {
    public static void kalendar(int year, int month){
        // Получаем первый день месяца
        LocalDate date = LocalDate.of(year, month, 1);

        // Определяем формат для вывода даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");

        // Печатаем заголовок календаря
        System.out.println(date.getMonth().toString() + " " + year);
        System.out.println("Пн Вт Ср Чт Пт Сб Вс");

        // Определяем отступ перед первым днем месяца
        int indent = date.getDayOfWeek().getValue() % 8;

        // Печатаем отступ
        for (int i = 0; i < indent - 1; i++) {
            System.out.print("   ");
        }

        // Печатаем дни месяца
        while (date.getMonthValue() == month) {
            String day = date.format(formatter);

            // Раскрашиваем выходные дни
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY || (day.equals("27") && month == 11)) {
                System.out.print("\u001B[31m" + day + "\u001B[0m ");
            } else {
                System.out.print(day + " ");
            }
            if (day.length() == 1){
                System.out.print(" ");
            }

            // Переходим к следующему дню
            date = date.plusDays(1);

            // Переходим на новую строку в конце недели
            if (date.getDayOfWeek().getValue() % 7 == 1) {
                System.out.println();
            }
        }
    }
}
