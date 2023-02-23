import java.util.Deque;
import java.util.LinkedList;

public class Task4_4 {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/a//b////c/d//././/.."));
    }

    public static String simplifyPath(String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("/");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("") || arr[i].equals("."))
                continue;
            else if (arr[i].equals("..")) {
                if (!list.isEmpty())
                    list.pollLast();
            } else
                list.add(arr[i]);
        }
        return "/" + String.join("/", list);
    }
}