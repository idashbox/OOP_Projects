package task11;

public enum Categories {
    VEGETABLES("Овощи"),
    FRUITS("Фрукты"),
    MILK_AND_OTHER("Молочные продукты"),
    MEAT("Мясо"),
    BREAD("Хлеб и выпечка"),
    BEVERAGES("Напитки"),
    SNACKS("Снеки"),
    CEREALS("Крупы"),
    CONFECTIONERY("Кондитерские изделия"),
    SAUCES("Соусы");

    private final String name;

    Categories(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
