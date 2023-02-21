import java.util.ArrayList;
import java.util.List;

// Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. 
// Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.

public class Homework3_3 {
    public static void main(String[] args) {
        Class3 book1 = new Class3("кинга1", "А. Иванов", 100, 2050, 223);
        Class3 book2 = new Class3("книга2", "Б. Сидоров", 100, 2000, 491);
        Class3 book3 = new Class3("книга3", "А. Иванов", 100, 2050, 379);
        Class3 book4 = new Class3("книга4", "Б. Сидоров", 100, 2000, 525);
        List<Class3> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        for (Class3 book : books) {
            if (book.getAuthor().contains("А")
            && book.getYear() >= 2010
            && checkPrime(book.getNums()))
                System.out.println(book.getName());
        }
    }

    private static boolean checkPrime(int num) {
        int d = 2;
        while (num % d != 0){
            d++;
        }
        if (d == num) return true;
        else return false;
    }
}
