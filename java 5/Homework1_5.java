import java.util.HashMap;
import java.util.Map;

// Подсчитать количество вхождения каждого слова

public class Homework1_5 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String text = "Подсчитать количество вхождения каждого слова";
        text = text.replaceAll("[.,\\(\\)!\\?\\-\\;]", "");
        String[] arr = text.toLowerCase().split(" ");
        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i], 0);
            map.put(arr[i], map.get(arr[i])+1);
        }
        for (var item: map.entrySet()) {
            System.out.println(item.getKey() + " = " + item.getValue());
        }
    }
}
