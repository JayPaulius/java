// Дан массив целых чисел. Верно ли, что массив является симметричным.

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        boolean check = check(arr);
        if(check == true){
            System.out.println("Массив симметричный");
        }
        else{
            System.out.println("Массив не симметричный");
        }
    }
    public static boolean check(int[] arr){
        for (int i = 0; i <  arr.length / 2; i++) {
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
