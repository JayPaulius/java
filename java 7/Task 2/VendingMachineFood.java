import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachineFood extends VendingMachine2 {
    
    private List<ProductFood> products = new ArrayList<>();

    public void initProducts(List<ProductFood> products) {
        this.products = products;
    }

    @Override
    public ProductFood getProduct(String name) {
        for (ProductFood product : products) {
            if (product.getName().equals(name))
                return product;
        }
        return new ProductFood("товар не найден", 0);
    }

    public ProductFood getProduct(String name, int maxCost) {
        for (ProductFood product : products) {
            if (product.getName().equals(name) && product.getCost() <= maxCost)
                return product;
        }
        return new ProductFood("товар не найден", 0);
    }

    public List<ProductFood> getProduct(int maxCost) {
        List<ProductFood> list = new ArrayList<>();
        for (ProductFood product : products) {
            if (product.getCost() <= maxCost)
                list.add(product);
        }
        if (!list.isEmpty())
            return list;
        else
            return new ArrayList<>(Arrays.asList(new ProductFood("товаров не найдено", 0)));
    }
    
}
