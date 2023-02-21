import java.util.ArrayList;
import java.util.List;

// Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший»

public class Homework1_3 {
    public static void main(String[] args) {
        Class1 product1 = new Class1("товар1", 1000, 1);
        Class1 product2 = new Class1("товар2", 3000, 3);
        Class1 product3 = new Class1("высший товар3", 2000, 1);
        Class1 product4 = new Class1("товар4", 2000, 2);
        Class1 product5 = new Class1("высший товар5", 3000, 2);
        Class1 product6 = new Class1("высший товар6", 1000, 1);
        List<Class1> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        String containsWord = "высший";
        int firstElementIndex = getFirstElementIndex(products, containsWord);
        int maxPrice = products.get(firstElementIndex).getPrice();
        String name = products.get(firstElementIndex).getName();
        for (int i = firstElementIndex+1; i < products.size(); i++) {
            if (products.get(i).getName().toLowerCase().contains(containsWord)
            && (products.get(i).getGrade() == 1 || products.get(i).getGrade() == 2)) {
                if (products.get(i).getPrice() > maxPrice){
                    maxPrice = products.get(i).getPrice();
                    name = products.get(i).getName();
                }
            }
        }
        System.out.println(name + ": " + maxPrice);
    }

    private static int getFirstElementIndex(List<Class1> products, String containsWord){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().toLowerCase().contains(containsWord)
            && (products.get(i).getGrade() == 1 || products.get(i).getGrade() == 2))
                return i;
        }
        return 0;
    }
}
