import java.util.Scanner;

// Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int num1 = scanner.nextInt();
        System.out.println(sum(num1, scanner));
        scanner.close();
    }
    public static int sum(int num1, Scanner scanner){
        int sum = 0;
        int count = 1;
        while (num1 != 0){
            System.out.printf("Введите число %d: ", ++count);
            int num2 = scanner.nextInt();
            if (num2 < 0 && num1 > 0) sum += num1;
            num1 = num2;
        }
        return sum;
    }
}
