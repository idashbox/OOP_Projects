package task10_5;

import java.time.LocalDate;

public class Product {
    private Categories category;
    private double weight;
    private LocalDate expirationDate;

    public Product(Categories category, double weight, LocalDate expirationDate) {
        this.category = category;
        this.weight = weight;
        this.expirationDate = expirationDate;
    }

    public Categories getCategory() {
        return category;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
