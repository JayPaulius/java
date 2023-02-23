import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Homework2_4 {
    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s){
        Deque<String> list1 = new LinkedList<>(List.of(s.split("")));
        int count = 0;
        list1.add(".");
        while(!list1.getFirst().equals(".")){
            if (!list1.getFirst().equals(".") 
             && !list1.getFirst().equals(")") 
             && !list1.getFirst().equals("}") 
             && !list1.getFirst().equals("]"))
            {
                list1.addLast(list1.remove());
                count++;
            }
            else if (!list1.getLast().equals(".") 
                    && ((list1.getFirst().equals(")") && list1.getLast().equals("("))
                    || (list1.getFirst().equals("}") && list1.getLast().equals("{"))
                    || (list1.getFirst().equals("]") && list1.getLast().equals("[")))
                    ){
                        list1.remove();
                        list1.removeLast();
                        count--;
                    }
            else 
                return false;
        }
        if (count != 0)
            return false;
        else
            return true;
    }
}
