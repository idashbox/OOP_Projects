package task12_builder_bridge;

import java.time.LocalDate;

public class Product {
    private Categories category;
    private double weight;
    private LocalDate expirationDate;
    private int periodOfUseInDays;

    private Product(Builder builder) {
        this.category = builder.category;
        this.weight = builder.weight;
        this.expirationDate = builder.expirationDate;
        this.periodOfUseInDays = builder.periodOfUseInDays;
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

    public int getExpirationDateInInt() {
        int result = 0;
        result = expirationDate.getYear() * 10000 + expirationDate.getMonthValue() * 100 + expirationDate.getDayOfMonth();
        return result;
    }

    public static class Builder {
        private Categories category;
        private double weight;
        private LocalDate expirationDate;
        private int periodOfUseInDays;

        public Builder setCategory(Categories category) {
            this.category = category;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setExpirationDate(LocalDate expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setPeriodOfUseInDays(int periodOfUseInDays) {
            this.periodOfUseInDays = periodOfUseInDays;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}