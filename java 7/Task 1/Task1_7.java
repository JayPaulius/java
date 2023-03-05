import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Реализуйте класс Товар, содержащий данные о товаре, 
// и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>) 
// сохраняющий в себе список исходных продуктов и getProduct(String name)

public class Task1_7 {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Product> products = new ArrayList<>(Arrays.asList(new Product("product1", 100),
        new Product("product2", 200)));
        vendingMachine.initProducts(products);
        System.out.println(vendingMachine.getProduct("product1"));
    }
}
