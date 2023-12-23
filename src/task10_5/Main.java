package task10_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(Categories.FRUITS, 0.5, LocalDate.of(2023, 12, 3)));
        products.add(new Product(Categories.VEGETABLES, 0.3, LocalDate.of(2023, 11, 30)));
        products.add(new Product(Categories.MEAT, 1.2, LocalDate.of(2023, 12, 5)));
        products.add(new Product(Categories.MILK_AND_OTHER, 0.8, LocalDate.of(2023, 12, 8)));

        Store store = new Store(products, 10000);


        Map<String, Double> categoryWeights = store.getCategoryWeights();

        System.out.println("Масса продуктов по категориям:");

        for (Map.Entry<String, Double> entry : categoryWeights.entrySet()) {
            String category = entry.getKey();
            double weight = entry.getValue();

            System.out.println(category + ": " + weight + " кг");
        }

        System.out.println("---------");


        List<Product> expiredProducts = store.getExpiredProducts();

        System.out.println("Просроченные продукты:");

        for (Product product : expiredProducts) {
            System.out.println(product.getCategory().getName());
        }

        System.out.println("---------");


        String freshestCategory = store.getFreshestCategory().getName();
        System.out.println("Категория самых свежих продуктов: " + freshestCategory);
    }
}

