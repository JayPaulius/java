import java.util.Scanner;

//Дана строка. Поменять местами ее половины.

// public class Task3 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.printf("Введите текст: ");
//         String text = scanner.nextLine();
//         char[] textChars = text.toCharArray();
//         int length = textChars.length;
//         char[] textChars1 = new char[length / 2];
//         char[] textChars2 = new char[length];
//         for (int i = 0; i < length / 2; i++) {
//             textChars1[i] = textChars[i];
//         }
//         for (int i = length / 2; i < length; i++) {
//             textChars2[i] = textChars[i];
//         }
//         text = String.valueOf(textChars);
//         System.out.println(text);
//         System.out.println(String.valueOf(textChars2) + String.valueOf(textChars1));
//         scanner.close();
//     }
// }

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите текст: ");
        String str = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        builder.append(str.substring(str.length() / 2, str.length())).append(str.substring(0, str.length() / 2));
        System.out.println(builder.toString());
        scanner.close();
    }
}
