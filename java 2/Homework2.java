import java.util.Scanner;

// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(seqCheck());
    }
    public static String seqCheck(){
        String check = "верно";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = sc.nextInt();
        System.out.println("Введите число 1:");
        int num1 = sc.nextInt();
        int count = 2;
        for (int i = 1; i < n; i++) {
            System.out.println("Введите число " + count++);
            int num2 = sc.nextInt();
            if (check != "неверно" && num2 <= num1) check = "неверно";
            num1 = num2;
        }
        sc.close();
        return check;
    }
}
