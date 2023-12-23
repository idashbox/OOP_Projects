package task12_builder_bridge;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    // Подсчет массы продуктов по категориям
    public Map<Categories, Double> getCategoryWeights() {
        Map<Categories, Double> categoryWeights = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.summingDouble(Product::getWeight)));


        return categoryWeights;
    }

    // Выбор просроченных продуктов
    public List<Product> getExpiredProducts() {
        LocalDate currentDate = LocalDate.now(); // Текущая дата
        List<Product> expiredProducts = products.stream()
                .filter(product -> !Period.between(product.getExpirationDate(), currentDate).isNegative())
                .collect(Collectors.toList());

        return expiredProducts;

    }

    // Поиск категории самых свежих продуктов
    public Categories getFreshestCategory() {
        Categories freshestCategory = products.stream()
                .max(Comparator.comparingInt(Product::getExpirationDateInInt))
                .map(Product::getCategory)
                .orElse(null);

        return freshestCategory;
    }
}
