import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.

public class Task1_4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int n = sc.nextInt();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(rand.nextInt(1, 10));
        }
        sc.close();
        int sum = 0;
        for (Integer list : linkedList) {
            if (list % 2 == 0){
                sum += list;
            }
        }
        System.out.println(linkedList);
        System.out.println(sum);
    }
}
