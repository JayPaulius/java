import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrink implements VendingMachine3 {
    private List<ProductHotDrink> products = new ArrayList<>();
    
    public void initProducts(List<ProductHotDrink> products){
        this.products = products;
    }

    @Override
    public String getProduct(String name, int volume, int temperature) {
        for (ProductHotDrink product : products) {
            if (product.getName().equals(name)
                && product.getVolume() == volume
                && product.getTemperature() == temperature)
                    return product.toString();
        }
        return "напиток не найден";
    }
    
    public String getProduct(String name) {
        List<ProductHotDrink> hotDrinkList = new ArrayList<>();
        for (ProductHotDrink product : products) {
            if (product.getName().equals(name))
                    hotDrinkList.add(product);
        }
        if (!hotDrinkList.isEmpty())
            return hotDrinkList.toString();
        else
            return String.format("напитка с именем %s не найдено", name);
    }
    
}
