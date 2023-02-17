import java.util.Scanner;

// Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.

public class Task2 {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int sum(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("количество чисел:");
        int n = sc.nextInt();
        System.out.print("число 1: ");
        int num1 = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.printf("число %d: ", i+1);
            int num2 = sc.nextInt();
            if (num1 % 2 == 0 && num2 % 10 == 5){
                sum += num2;
            }
            num1 = num2;
        }
        sc.close();
        return sum;
    }
}
