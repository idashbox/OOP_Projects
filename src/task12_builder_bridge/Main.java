package task12_builder_bridge;


import task12_builder_bridge.color.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product.Builder()
                .setCategory(Categories.FRUITS)
                .setWeight(0.5)
                .setExpirationDate(LocalDate.of(2023, 12, 3))
                .setPeriodOfUseInDays(10)
                .build());

        products.add(new Product.Builder()
                .setCategory(Categories.VEGETABLES)
                .setWeight(0.3)
                .setExpirationDate(LocalDate.of(2023, 11, 30))
                .setPeriodOfUseInDays(12)
                .build());
        products.add(new Product.Builder()
                .setCategory(Categories.MEAT)
                .setWeight(10.5)
                .setExpirationDate(LocalDate.of(2023, 12, 30))
                .setPeriodOfUseInDays(14)
                .build());

        products.add(new Product.Builder()
                .setCategory(Categories.BEVERAGES)
                .setWeight(5.0)
                .setExpirationDate(LocalDate.of(2024, 2, 26))
                .setPeriodOfUseInDays(90)
                .build());
        products.add(new Product.Builder()
                .setCategory(Categories.CEREALS)
                .setWeight(100.5)
                .setExpirationDate(LocalDate.of(2024, 3, 15))
                .setPeriodOfUseInDays(200)
                .build());

        products.add(new Product.Builder()
                .setCategory(Categories.MILK_AND_OTHER)
                .setWeight(28.7)
                .setExpirationDate(LocalDate.of(2023, 12, 30))
                .setPeriodOfUseInDays(12)
                .build());
        products.add(new Product.Builder()
                .setCategory(Categories.BREAD)
                .setWeight(14.0)
                .setExpirationDate(LocalDate.of(2023, 12, 22))
                .setPeriodOfUseInDays(5)
                .build());

        products.add(new Product.Builder()
                .setCategory(Categories.CONFECTIONERY)
                .setWeight(205.5)
                .setExpirationDate(LocalDate.of(2023, 1, 30))
                .setPeriodOfUseInDays(60)
                .build());
        products.add(new Product.Builder()
                .setCategory(Categories.SAUCES)
                .setWeight(15.7)
                .setExpirationDate(LocalDate.of(2023, 2, 14))
                .setPeriodOfUseInDays(90)
                .build());

        products.add(new Product.Builder()
                .setCategory(Categories.SNACKS)
                .setWeight(70.7)
                .setExpirationDate(LocalDate.of(2023, 11, 27))
                .setPeriodOfUseInDays(99)
                .build());

        Store store = new Store(products, 10000);
        System.out.println("\u001B[36m                                      СОДЕРЖИМОЕ СКЛАДА\u001B[0m");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("|  \u001B[35m      Категория      \u001B[0m   | \u001B[35m   Вес (кг) \u001B[0m  |\u001B[35m  Последняя дата годности \u001B[0m|  \u001B[35m  Срок годности  \u001B[0m |");
        System.out.println("----------------------------------------------------------------------------------------");

        for (Product product : store.getProducts()) {
            String category = product.getCategory().getName();
            double weight = product.getWeight();
            LocalDate expirationDate = product.getExpirationDate();
            int expirationDateInt = product.getExpirationDateInInt();

            Color color;
            if (expirationDateInt < LocalDate.now().getYear() * 10000 + LocalDate.now().getMonthValue() * 100 + LocalDate.now().getDayOfMonth()) {
                color = new ExpiredColor(new RedColor());
            } else {
                color = new FreshColor(new GreenColor());
            }

            String colorCode = color.getColorCode();
            int periodOfUseInDays = product.getPeriodOfUseInDays();

            System.out.printf("| %-23s |     %.2f      |       %s        |        %d         |%n", category, weight, color.colorizeText(expirationDate.toString(), colorCode), periodOfUseInDays);
        }

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println();

    Map<Categories, Double> categoryWeights = store.getCategoryWeights();
        System.out.println("\u001B[33mМасса продуктов по категориям:\u001B[0m");
        categoryWeights.forEach((category, weight) -> System.out.println(category.getName() + ": " + weight + " кг"));

        System.out.println();

        List<Product> expiredProducts = store.getExpiredProducts();
        System.out.println("\u001B[31mПросроченные продукты:\u001B[0m");
        expiredProducts.forEach(product -> System.out.println(product.getCategory().getName()));

        System.out.println();

        Categories freshestCategory = store.getFreshestCategory();
        System.out.println("\u001B[32mКатегория самых свежих продуктов: \u001B[0m" +  freshestCategory.getName());
    }
}

