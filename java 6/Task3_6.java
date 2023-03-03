import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Найти пересечения слов в массивах и указать их общее количество.
// Пример: Mas1= ["qwe","asd","qwe","x"] Mas2=["qwe","v"]
// Результат: qwe=3 

public class Task3_6 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> list2 = new ArrayList<>(Arrays.asList("qwe", "v"));
        Set<String> set = new HashSet<>(list1);
        set.retainAll(new HashSet<>(list2));
        if (set.size() != 0) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < list1.size(); i++) {
                if (set.contains(list1.get(i))) {
                    map.putIfAbsent(list1.get(i), 0);
                    map.put(list1.get(i), map.get(list1.get(i)) + 1);
                }
            }
            for (int i = 0; i < list2.size(); i++) {
                if (set.contains(list2.get(i))) {
                    map.putIfAbsent(list2.get(i), 0);
                    map.put(list2.get(i), map.get(list2.get(i)) + 1);
                }
            }
            for (var item : map.entrySet()) {
                System.out.printf("%s = %d \n", item.getKey(), item.getValue());
            }
        }
        else
            System.out.println("-");
    }
}

// List<String> list1 = new ArrayList<>(Arrays.asList("qwe","asd","qwe","x"));
// List<String> list2 = new ArrayList<>(Arrays.asList("qwe","v"));
// Map<String, Integer> map = new HashMap<>();
// for (int i = 0; i < list1.size(); i++) {
// map.putIfAbsent(list1.get(i), 0);
// map.put(list1.get(i), map.get(list1.get(i))+1);
// }
// for (int i = 0; i < list2.size(); i++) {
// map.putIfAbsent(list2.get(i), 0);
// map.put(list2.get(i), map.get(list2.get(i))+1);
// }
// for (var item : map.entrySet()) {
// if (list1.contains(item.getKey()) && list2.contains(item.getKey()))
// System.out.printf("%s = %d \n", item.getKey(), item.getValue());
// }