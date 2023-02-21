import java.util.ArrayList;
import java.util.List;

// Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам. 
// Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.

public class Task2_3 {
    public static void main(String[] args) {
        Students student1 = new Students("Иванов", 1, 1000, List.of(5, 5, 5));
        Students student2 = new Students("Иванова", 2, 1000, List.of(5, 4, 4));
        Students student3 = new Students("Сидоров", 3, 1000, List.of(4, 4, 4));
        Students student4 = new Students("Сидорова", 4, 1000, List.of(5, 5, 4));
        Students student5 = new Students("Иванова", 4, 1000, List.of(5, 5, 4));
        List<Students> studList = new ArrayList<>();
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);
        studList.add(student4);
        studList.add(student5);
        String endSurname = "ова";
        for (Students student : studList) {
            if (checkSurname(student.getSurname(), endSurname) && checkGrade(student.getGrades())) {
                System.out.println(student.getSurname() + " - " + String.valueOf(student.getStipend()));
            }
        }
    }

    public static boolean checkSurname(String surname, String endSurname) {
        int indexOfFirstElemEndSurname = surname.length() - endSurname.length();
        if (surname.substring(indexOfFirstElemEndSurname).equals(endSurname))
            return true;
        else
            return false;
    }

    public static boolean checkGrade(List<Integer> grades) {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        if (sum % 2 == 0)
            return true;
        else
            return false;
    }
}
