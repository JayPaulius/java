import java.util.HashMap;
import java.util.Map;

// Посчитать количество вхождений каждого символа в текст.

public class Task1_5 {
    public static void main(String[] args) {
        Map<Character, Integer> mapChar = new HashMap<>();
        String text = "Посчитать количество вхождений";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            mapChar.putIfAbsent(c, 0);
            mapChar.put(c, mapChar.get(c) + 1);
            // if (!mapChar.containsKey(c)) {
            //     mapChar.put(c, 1);
            // } else {
            //     mapChar.put(c, mapChar.get(c) + 1);
            // }
        }
        System.out.println(mapChar);
    }
}
