
/**
 * program
 */

public class Program {
    public static void main(String[] args) {
        var a = 123;
        getType(a);
        String s = "123";
        s.charAt(0);
        int[] arr = new int[] {1,2,3};
        for (int item : arr) {
            System.out.println(item);
        }
    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}

// import java.io.FileWriter;
// import java.io.IOException;

// public class Program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", true)) {
//             fw.write("line 1 \n");
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3 \n");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }

/**
 * program
 */
// import java.io.*;

// public class Program {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("%s\n", str);
//         }
//         br.close();
//     }
// }