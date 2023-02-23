import java.util.LinkedList;
import java.util.Random;

// Заменить некратные 3 элементы списка, суммой нечетных элементов.

public class Task2_4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        int sumOdd = 0;
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(1, 15));
            if (list.get(i) % 2 != 0)
                sumOdd += list.get(i);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 != 0)
            list.set(i, sumOdd);
        }
        System.out.println(list);
    }    
}
