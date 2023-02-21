import java.util.Scanner;

// Реализуйте pow(x, n) , который вычисляет xв степени n(т.е. ).xn

public class Task1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        double x = sc.nextDouble();
        System.out.println("Введите степень:");
        int n = sc.nextInt();
        System.out.printf("result: %.5f", myPow(x, n));
        sc.close();
    }

    public static double myPow(double x, int n) {
        double res = 1;
        if (n < 0) {
            n *= -1;
            x = 1 / x;
        }
        for (int i = 0; i < n; i++) {
            res *= x;
        }
        return res;
    }
}
