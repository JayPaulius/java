import java.util.Scanner;

// Дана последовательность N целых чисел. Найти сумму простых чисел.

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Сумма простых чисел: " + sum());
    }
    public static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Введите число " + i);
            int num = sc.nextInt();
            if (num != 1 && check(num) == true) sum += num; 
        }
        sc.close();
        return sum;
    }
    public static boolean check(int num){
        int d = 2;
        while (num % d != 0){
            d++;
        }
        if (d == num) return true;
        else return false;
    }
}
