import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products = new ArrayList<>();

    public void initProducts(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name))
                return product;
        }
        return new Product("товар не найден", 0);
    }
}
