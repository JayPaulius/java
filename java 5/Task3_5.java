import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3_5 {
    public static void main(String[] args) {
        System.out.println("Введите римское число:");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Арабское число:");
        System.out.println(convert(text));
        sc.close();
    }

    private static int convert(String text) {
        Map<Character, Integer> map = new HashMap<>();
        text = text.toLowerCase();
        map.put('i', 1);
        map.put('v', 5);
        map.put('x', 10);
        map.put('l', 50);
        map.put('c', 100);
        map.put('d', 500);
        map.put('m', 1000);
        int num = map.get(text.charAt(text.length()-1));
        for (int i = 0; i < text.length()-1; i++) {
            if (map.get(text.charAt(i)) < map.get(text.charAt(i+1)))
                num -= map.get(text.charAt(i));
            else
                num += map.get(text.charAt(i));
        }
        return num;
    }

}
