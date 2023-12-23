package task10_5;

public enum Categories {
    VEGETABLES("Овощи"),
    FRUITS("Фрукты"),
    MILK_AND_OTHER("Молочные продукты"),
    MEAT("Мясо");

    private final String name;

    Categories(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
