import java.util.Iterator;

public class Task1_9 {
    public static void main(String[] args) {
        Beverage latte = new Beverage();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Beans("зерна"));
        latte.addComponent(new Milk("молоко"));
        for (var ingredient : latte) {
            System.out.println(ingredient);
        }
        Iterator<Ingredient> iter = latte.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
