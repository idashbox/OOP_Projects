package task11;

import java.time.LocalDate;

public class Product {
    private Categories category;
    private double weight;
    private LocalDate expirationDate;
    private int periodOfUseInDays;

    public Product(Categories category, double weight, LocalDate expirationDate, int periodOfUseInDays) {
        this.category = category;
        this.weight = weight;
        this.expirationDate = expirationDate;
        this.periodOfUseInDays = periodOfUseInDays;
    }

    public Categories getCategory() {
        return category;
    }

    public double getWeight() {
        return weight;
    }
    public int getPeriodOfUseInDays() {
        return periodOfUseInDays;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    public int getExpirationDateInInt(){
        int result = 0;
        result = expirationDate.getYear() * 10000 + expirationDate.getMonthValue() * 100 + expirationDate.getDayOfMonth();
        return result;
    }
}
