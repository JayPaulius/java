public class Task4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(5, 10, 15);
        Vector vector2 = new Vector(15, 5, 10);
        System.out.println(vector1.toString());
        System.out.println("length = " + vector1.length());
        System.out.println("scal = " + vector1.scal(vector2));
        System.out.println("prod = " + vector1.prod(vector2));
        System.out.println("cosinus = " + vector1.cosinus(vector2));
        System.out.println("sum = " + vector1.sum(vector2));
        System.out.println("diff = " + vector1.diff(vector2));
    }
}
