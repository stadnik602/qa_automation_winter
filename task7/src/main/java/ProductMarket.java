import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    List<Product> productList;

    public ProductMarket(List<Product> productList) {
        this.productList = productList;
    }

    public List<String> getAllNames() {
        List<String> productNames = new ArrayList<>();

        for (Product product : productList) {
            productNames.add(product.getName());
        }
        return productNames;
    }

    public List<String> getNamesByAlphabetic() {
        List<String> productNames = getAllNames();
        Collections.sort(productNames);
        return productNames;
    }

    public List<Double> getPricesMoreThen10() {
        List<Double> pricesList =  getPricesList();
        List<Double> priceMoreThen10 = new ArrayList<>();
        for (Double productPrice : pricesList) {
            if (productPrice > 10) {
                priceMoreThen10.add(productPrice);
            }
        }
        return priceMoreThen10;
    }

    public List<Double> getPricesLessThen5() {
        List<Double> pricesList =  getPricesList();
        List<Double> priceLessThen5 = new ArrayList<>();
        for (Double productPrice : pricesList) {
            if (productPrice < 5) {
                priceLessThen5.add(productPrice);
            }
        }
        return priceLessThen5;
    }

    public List<String> getPricesAsString() {
        return getPricesList().stream().map(Object::toString).collect(Collectors.toList());

    }

    private List<Double> getPricesList() {
        List<Double> productPrices = new ArrayList<>();

        for (Product product : productList) {
            productPrices.add(product.getPrice());
        }
        return productPrices;
    }
}
