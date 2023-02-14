// Дан массив nums. Мы определяем текущую сумму массива как runningSum[i] = sum(nums[0]…nums[i]).
// Вернуть текущую сумму nums.

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 10, 1 };
        int[] arr2 = new int[arr.length];
        arr2[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr2[i] = arr[i] + arr2[i-1];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
