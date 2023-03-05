import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды), 
// сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата 
// (пример: ПродающийБутылкиВодыАвтомат)

public class Task2_7 {
    public static void main(String[] args) {
        VendingMachineFood vmfood = new VendingMachineFood();
        List<ProductFood> products = new ArrayList<>(Arrays.asList(new ProductFood("еда1", 100),
        new ProductFood("еда2", 200)));
        vmfood.initProducts(products);
        System.out.println(vmfood.getProduct("еда1"));
        System.out.println(vmfood.getProduct("еда2", 50));
        System.out.println(vmfood.getProduct(100));
        
    }
}
