import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.

public class Homework2_3 {
    public static void main(String[] args) {
        Class2 product1 = new Class2("товар1", "страна1", 1, 2, 200);
        Class2 product2 = new Class2("товар2", "страна2", 1, 2, 100);
        Class2 product3 = new Class2("товар3", "страна3", 1, 1, 100);
        Class2 product4 = new Class2("товар4", "страна4", 1, 1, 200);
        Class2 product5 = new Class2("товар5", "страна5", 1, 2, 100);
        Class2 product6 = new Class2("товар6", "страна6", 1, 1, 200);
        Class2 product7 = new Class2("товар7", "страна7", 1, 1, 100);
        List<Class2> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт товара:");
        int grade = sc.nextInt();
        sc.close();
        int[] arr = getFirstElementIndex(products, grade);
        if (arr[0] == 1) {
            int firstElementIndex = arr[1];
            productsNamesMinPrice(products, grade, firstElementIndex);
        } else {
            System.out.println("Сорт не найден");
        }
    }

    private static int[] getFirstElementIndex(List<Class2> products, int grade) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getGrade() == grade)
                return new int[] {1, i};
        }
        return new int[] { 0 };
    }

    private static void productsNamesMinPrice(List<Class2> products, int grade, int firstElementIndex){
        int minPrice = getMinPrice(products, grade, firstElementIndex);
        for (int i = firstElementIndex; i < products.size(); i++) {
            if (products.get(i).getGrade() == grade && products.get(i).getPrice() == minPrice)
                System.out.println(products.get(i).getName());
        }
    }

    private static int getMinPrice(List<Class2> products, int grade, int firstElementIndex){
        int minPrice = products.get(firstElementIndex).getPrice();
        for (int i = firstElementIndex+1; i < products.size(); i++) {
            if (products.get(i).getGrade() == grade){
                if (products.get(i).getPrice() < minPrice)
                    minPrice = products.get(i).getPrice();
            }
        }
        return minPrice;
    }
}
