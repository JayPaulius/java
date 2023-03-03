import java.util.Scanner;

// Напишите интерфейс Converter для конвертации из градусов по Цельсию в Кельвины, Фаренгейты. 
// У классов наследников необходимо переопределить метод интерфейса, для валидного перевода величин. 
// Метод для конвертации назовите "convertValue".
// 0 °C + 273,15 = 273,15 K
// 0 °C × 1,8 + 32 = 32 °F


public class Task4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру в цельсиях:");
        double temp = sc.nextDouble();
        System.out.println("Выберите единицу измерения: 1 - кельвины, 2 - фаренгейты");
        int mode = sc.nextInt();
        sc.close();
        if (mode == 1)
            System.out.println(new Kelvin().convertValue(temp));
        else
            System.out.println(new Fahrenheit().convertValue(temp));
    }
}
