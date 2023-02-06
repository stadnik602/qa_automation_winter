package zoo.model;

public enum SnacksAndDrinks {
    CHIPS(20, "food"),
    WATER(10, "drink"),
    BEER(35, "drink"),
    LEMONADE(15, "drink"),
    HAMBURGER(75, "food"),
    PEPSI(25, "drink");

    public final int price;
    public final String type;

    SnacksAndDrinks(int price, String type) {
        this.price = price;
        this.type = type;
    }
}

