import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProductMarket productMarket = new ProductMarket(Arrays.asList(
                new Product("Meat", 13),
                new Product("Bread", 4),
                new Product("Milk", 7),
                new Product("Cheese", 8),
                new Product("Water", 2),
                new Product("Beer", 4),
                new Product("Ice-Cream", 3),
                new Product("Wine", 12),
                new Product("Wiskie", 25)
        ));

        System.out.println(productMarket.getAllNames());
        System.out.println(productMarket.getNamesByAlphabetic());
        System.out.println(productMarket.getPricesMoreThen10());
        System.out.println(productMarket.getPricesLessThen5());
        System.out.println(productMarket.getPricesAsString());
    }
}
