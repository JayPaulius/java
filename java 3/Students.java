import java.util.List;

public class Students {
    private String surname;
    private int group;
    private int stipend;
    private List<Integer> grades;

    public Students(String surname, int group, int stipend, List<Integer> grades) {
        this.surname = surname;
        this.group = group;
        this.stipend = stipend;
        this.grades = grades;
    }

    public String getSurname() {
        return surname;
    }

    public int getGroupnum() {
        return group;
    }

    public int getStipend() {
        return stipend;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGroupnum(int group) {
        this.group = group;
    }

    public void setStipend(int stipend) {
        this.stipend = stipend;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}
