import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Найти пересечение двух множеств
// Пример: set1= [1,2,3,4] set2= [3,5,6,7]
// Вывод в консоль: [3]

public class Task2_6 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,5,6,7));
        Set<Integer> res = new HashSet<>(set1);
        res.retainAll(set2);
        System.out.println(res);
    }
}
