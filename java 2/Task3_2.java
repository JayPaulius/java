//  Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.

public class Task3_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 10, 5, 3, 9, 1};
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]*2 == arr[i-1]) count++;
        }
        System.out.println(count);
    }
}
