package task10_5;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    private List<Product> products = new ArrayList<>();
    private double size;

    public Store(List<Product> products, double size) {
        this.products = products;
        this.size = size;
    }

    public void setProduct(Product product) {
        if (product.getWeight() <= size) {
            products.add(product);
            size -= product.getWeight();
        }
    }

    // Подсчет массы продуктов по категориям
    public Map<String, Double> getCategoryWeights() {

        Map<String, Double> categoryWeights = new HashMap<>();
        for (Product product : products) {
            String category = product.getCategory().getName();
            double weight = product.getWeight();

            categoryWeights.put(category, categoryWeights.getOrDefault(category, 0.0) + weight);
        }

        return categoryWeights;
    }

    // Выбор просроченных продуктов
    public List<Product> getExpiredProducts() {

        List<Product> expiredProducts = new ArrayList<>();
        LocalDate currentDate = LocalDate.now(); // Текущая дата

        for (Product product : products) {
            Period period = Period.between(product.getExpirationDate(), currentDate);
            if (!period.isNegative()) {
                expiredProducts.add(product);
            }
        }
        return expiredProducts;

    }

    // Поиск категории самых свежих продуктов
    public Categories getFreshestCategory() {

        Categories freshestCategory = null;
        LocalDate minDate = LocalDate.of(1999, 1, 1);

        for (Product product : products) {
            LocalDate expirationDate = product.getExpirationDate();
            Period period = Period.between(expirationDate, minDate);
            if (period.isNegative()) {
                minDate = expirationDate;
                freshestCategory = product.getCategory();
            }
        }

        return freshestCategory;
    }
}
