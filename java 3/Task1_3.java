// Даны сведения об экспортируемых товарах: указывается наименование товара, страна, экспортирующая товар, и объем поставляемой партии в штуках. 
// Найти страны, которые экспортируют данный товар, и общий объем его экспорта.

import java.util.ArrayList;
import java.util.List;;

public class Task1_3 {
    public static void main(String[] args) {
        Items items1 = new Items("item1", "country1", 5);
        Items items2 = new Items("item2", "country2", 10);
        Items items3 = new Items("item3", "country3", 15);
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        System.out.println(itemsList.toString());
        String searchName = "item1";
        int sumVolume = 0;
        List<String> countries = new ArrayList<>();

        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().equals(searchName)) {
                sumVolume += itemsList.get(i).getVolume();
                boolean f = true;
                for (int j = 0; j < countries.size(); j++) {
                    if (itemsList.get(i).getCountry().equals(countries.get(j)))  {
                        f = false;
                    }
                }
                if (f) {
                    countries.add(itemsList.get(i).getCountry());
                }
            }
        }
        System.out.println("countries: " + countries);
        System.out.println("sumVolume = " + sumVolume);
    }
}
