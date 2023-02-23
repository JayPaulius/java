import java.util.LinkedList;
import java.util.List;

// Вывести список на экран в перевернутом виде (без массивов и ArrayList)
// Пример:
// 1 -> 2->3->4
// Вывод:
// 4->3->2->1

public class Homework1_4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.pollLast());
        }
        System.out.println(list);
    }
}
