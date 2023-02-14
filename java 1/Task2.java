import java.util.Scanner;

// Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите количество чисел: ");
        int n = scanner.nextInt();
        System.out.printf("Введите число 1: ");
        int num1 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            System.out.printf("Введите число %d :", i+1);
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0) count++;
            num1 = num2;
        }
        System.out.println(count);
        scanner.close();
    }
}
