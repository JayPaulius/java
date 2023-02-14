import java.util.Scanner;

// Учитывая входную строку s, измените порядок слов в обратном порядке.

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String s = scanner.nextLine();
        System.out.println(reverseWords(s));
        scanner.close();
    }
    public static String reverseWords(String s) {
        String str = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                temp += s.charAt(i);
            }
            else if (temp != ""){
                str = temp + " " + str;
                temp = "";
            }
        }
        str = temp + " " + str;
        return str;
    }
}
