import java.util.ArrayList;
import java.util.List;

// Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
// В противном случае (false).


public class Task2_5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(duplicate(arr));
    }
    
    public static boolean duplicate(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i]))
                list.add(arr[i]);
            else
                return true;
        }
        return false;
    }
}
