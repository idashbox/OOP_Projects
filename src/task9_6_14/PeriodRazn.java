package task9_6_14;

import java.time.LocalDate;
import java.time.Period;

import static java.lang.Math.abs;

public class PeriodRazn {
    public static void main(String[] args) {
    }
    public static void periodRazn(LocalDate date1, LocalDate date2){

        // Получаем разницу между датами в виде объекта класса Period
        Period period = Period.between(date1, date2);
        String year;
        String month;
        String day;
        if (abs(period.getYears()) == 1){
            year = " год, ";
        } else if (abs(period.getYears()) > 1 && abs(period.getYears()) < 5){
            year = " года, ";
        }else{
            year = " лет, ";
        }

        if (abs(period.getMonths()) == 1){
            month = " месяц, ";
        } else if (abs(period.getMonths()) > 1 && abs(period.getMonths()) < 5){
            month = " месяца, ";
        }else{
            month = " месяцев, ";
        }

        if (abs(period.getDays()) == 1){
            day = " день.";
        } else if (abs(period.getDays()) > 1 && abs(period.getDays()) < 5){
            day = " дня.";
        }else{
            day = " дней.";
        }
        // Выводим разницу в формате "лет, месяцев, дней"
        System.out.println("Разница между датами: " + period.getYears() + year + period.getMonths() + month +
                period.getDays() + day);
    }
}
