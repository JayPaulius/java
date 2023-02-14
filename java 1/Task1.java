import java.util.Scanner;

//Для заданного целого числа n верните разницу между произведением его цифр и суммой его цифр.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = scanner.nextInt();
        scanner.close();
        int prod = 1;
        int sum = 0;
        int result;
        while (n != 0){
            prod *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        result = prod - sum;
        System.out.println(result);
    }
}
