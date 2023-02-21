import java.util.ArrayList;
import java.util.List;


// Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах), 
// его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). 
// Найти:
// - количество кубиков желтого цвета и их суммарный объем;
// - количество деревянных кубиков с ребром 3 см

public class Task3_3 {
    public static void main(String[] args) {
        Cubes cubes1 = new Cubes(4, "красный", "дерево");
        Cubes cubes2 = new Cubes(3, "желтый", "металл");
        Cubes cubes3 = new Cubes(5, "зеленый", "картон");
        Cubes cubes4 = new Cubes(5, "зеленый", "картон");
        List<Cubes> cubeList = new ArrayList<>();
        cubeList.add(cubes1);
        cubeList.add(cubes2);
        cubeList.add(cubes3);
        cubeList.add(cubes4);
        int k = 0;
        int volume = 0;
        int kWood = 0;
        for (Cubes cubes : cubeList) {
            if (cubes.getColor().equals("желтый")) {
                k++;
                volume += Math.pow(cubes.getSize(), 3);
            }
            if (cubes.getMaterial().equals("дерево") && cubes.getSize() == 3)
                kWood++;
        }
        System.out.println("количество кубиков желтого цвета и их суммарный объем: " + k + ", " + volume);
        System.out.println("количество деревянных кубиков с ребром 3 см: " + kWood);
    }
}
