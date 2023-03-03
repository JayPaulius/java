import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Дан массив чисел, посчитать процент уникальных чисел.
// *процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class Task1_6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2));
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set.size()*100/list.size() + " %");
    }
}
