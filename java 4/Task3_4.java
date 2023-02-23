import java.util.LinkedList;
import java.util.Random;

// Построить однонаправленный список целых чисел.  Удалить отрицательные элементы списка.

public class Task3_4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(-10, 10));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
