package task11;


import task11.color.Color;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(Categories.FRUITS, 0.5, LocalDate.of(2023, 12, 3), 10));
        products.add(new Product(Categories.VEGETABLES, 0.3, LocalDate.of(2023, 11, 30), 12));
        products.add(new Product(Categories.MEAT, 1.2, LocalDate.of(2023, 12, 23), 7));
        products.add(new Product(Categories.MILK_AND_OTHER, 0.8, LocalDate.of(2023, 12, 30), 14));
        products.add(new Product(Categories.BREAD, 0.4, LocalDate.of(2023, 12, 5), 8));
        products.add(new Product(Categories.BEVERAGES, 1.5, LocalDate.of(2023, 12, 10), 15));
        products.add(new Product(Categories.SNACKS, 0.2, LocalDate.of(2023, 12, 15), 6));
        products.add(new Product(Categories.CEREALS, 0.7, LocalDate.of(2023, 12, 20), 10));
        products.add(new Product(Categories.CONFECTIONERY, 0.3, LocalDate.of(2023, 12, 25), 5));
        products.add(new Product(Categories.SAUCES, 0.1, LocalDate.of(2023, 12, 31), 7));

        Store store = new Store(products, 10000);

        System.out.println("Содержимое склада:");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("|        Категория         |   Вес (кг)   | Последняя дата годности |   Срок годности   |");
        System.out.println("---------------------------------------------------------------------------------------");

        for (Product product : store.getProducts()) {
            String category = product.getCategory().getName();
            double weight = product.getWeight();
            LocalDate expirationDate = product.getExpirationDate();
            int expirationDateInt = product.getExpirationDateInInt();

            String colorCode = Color.getColorCode(expirationDateInt);
            int periodOfUseInDays = product.getPeriodOfUseInDays();

            System.out.printf("| %-23s |     %.2f      |       %s        |        %d         |%n", category, weight, Color.colorizeText(expirationDate.toString(), colorCode), periodOfUseInDays);
        }

        System.out.println("------------------------------------------------------------");


    Map<Categories, Double> categoryWeights = store.getCategoryWeights();
        System.out.println("Масса продуктов по категориям:");
        categoryWeights.forEach((category, weight) -> System.out.println(category + ": " + weight + " кг"));

        System.out.println("---------");

        List<Product> expiredProducts = store.getExpiredProducts();
        System.out.println("Просроченные продукты:");
        expiredProducts.forEach(product -> System.out.println(product.getCategory()));

        System.out.println("---------");

        Categories freshestCategory = store.getFreshestCategory();
        System.out.println("Категория самых свежих продуктов: " + freshestCategory);
    }
}
// Больше категорий, выводить таблицу склада, свежее - зелёным, красным - просроченное. Добавить срок использования
