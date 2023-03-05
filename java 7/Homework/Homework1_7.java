import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) 
 * выдающий продукт соответствующий имени, объему и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 */

public class Homework1_7 {
    public static void main(String[] args) {
        VendingMachineHotDrink HotDrinkMachine1 = new VendingMachineHotDrink();
        VendingMachineHotDrink HotDrinkMachine2 = new VendingMachineHotDrink();
        
        List<ProductHotDrink> hotDrinkList1 = new ArrayList<>(Arrays.asList(
        new ProductHotDrink("чай", 150, 70),
        new ProductHotDrink("кофе", 100, 80), 
        new ProductHotDrink("вода", 200, 60)));
        List<ProductHotDrink> hotDrinkList2 = new ArrayList<>(Arrays.asList(
        new ProductHotDrink("вода", 250, 60),
        new ProductHotDrink("чай", 150, 80), 
        new ProductHotDrink("кофе", 150, 70)));

        HotDrinkMachine1.initProducts(hotDrinkList1);
        HotDrinkMachine2.initProducts(hotDrinkList2);

        System.out.println(HotDrinkMachine1.getProduct("чай", 150, 70));
        System.out.println(HotDrinkMachine2.getProduct("вода", 250, 60));
        System.out.println(HotDrinkMachine1.getProduct("кофе"));
        System.out.println(HotDrinkMachine2.getProduct("чай"));
    }
}
