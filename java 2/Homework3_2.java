import java.util.Scanner;

// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

public class Homework3_2 {
    public static void main(String[] args) {
        int[] arr = getArray();
        printArray("Исходный массив:", arr);
        printArray("Новый массив:", replaceElements(arr, sumIndexes(arr)));
    }

    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Введите элемент %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int sumIndexes(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 100 && arr[i] > 9 ||
                arr[i] > -100 && arr[i] < -9) {
                sum += i;
            }
        }
        System.out.println("Сумма индексов двузначных элементов: " + sum);
        return sum;
    }

    public static int[] replaceElements(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                arr[i] = sum;
        }
        return arr;
    }

    public static void printArray(String title, int[] arr) {
        System.out.println(title);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
