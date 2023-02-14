import java.util.Scanner;

// Учитывая две двоичные строки a и b, верните их сумму в виде двоичной строки .

// Example 1:
// Input: a = "11", b = "1"
// Output: "100"

// Example 2:
// Input: a = "1010", b = "1011"
// Output: "10101"

// public class Task4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.printf("Введите число 1: ");
//         String a = scanner.nextLine();
//         System.out.printf("Введите число 2: ");
//         String b = scanner.nextLine();
//         int num1 = Integer.parseInt(a, 2);
//         int num2 = Integer.parseInt(b, 2);
//         int sum = num1 + num2;
//         System.out.println(Integer.toBinaryString(sum));
//         scanner.close();
//     }
// }

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число 1: ");
        String a = scanner.nextLine();
        System.out.printf("Введите число 2: ");
        String b = scanner.nextLine();
        scanner.close();
        System.out.println(addBinarry(a, b));
    }

    public static String addBinarry(String a, String b) {
        if (a.length() < b.length()) {
            return addBinarry(b, a);
        }
        String res = "";
        int k = 0;
        int j = b.length()-1;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                k++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                k++;
            }
            res = k % 2 + res;
            j--;
            k /= 2;
        }
        if (k > 0) {
            res = k + res;
        }

        return res;
    }
}