import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Homework1_6 {
    public static void main(String[] args) {
        Laptops l1 = new Laptops("Acer", "Acer Extensa 15 EX215-31-P1DB", "Intel Pentium Silver N5030", "4 ГБ", "128 ГБ", 28000);
        Laptops l2 = new Laptops("Acer", "Acer Aspire 3 A315-34-C2QH", "Intel Celeron N4120", "4 ГБ", "128 ГБ", 30000);
        Laptops l3 = new Laptops("ASUS", "ASUS Laptop 15 D543MA-DM1369", "Intel Pentium Silver N5030", "6 ГБ", "1 ТБ", 28000);
        Laptops l4 = new Laptops("ASUS", "ASUS Laptop 14 F415EA-EB736", "Intel Pentium Gold 7505", "8 ГБ", "256 ГБ", 33000);
        Laptops l5 = new Laptops("Lenovo", "Lenovo IdeaPad 3 15ADA05", "AMD 3020e", "4 ГБ", "256 ГБ", 28000);
        List<Laptops> laptops = new ArrayList<>(Arrays.asList(l1, l2, l3, l4, l5));
        List<Laptops> foundLaptops = new ArrayList<>();
        Map<String, String> parameters = selectParameters(laptops);
        if (parameters == null){
            printLaptops(laptops);
        }
        else{
            foundLaptops = getFoundLaptops(laptops, parameters);
            if (!foundLaptops.isEmpty())
                printLaptops(foundLaptops);
            else
                System.out.println("По заданным критериям ноутбуков не найдено");
        }
    }

    public static Map<String, String> selectParameters(List<Laptops> laptops) {
        Set<String> brand = new TreeSet<>();
        Set<String> cpu = new TreeSet<>();
        Set<String> ram = new TreeSet<>();
        Set<String> drivesize = new TreeSet<>();
        for (Laptops laptop : laptops) {
            brand.add(laptop.brand);
            cpu.add(laptop.cpu);
            ram.add(laptop.ram);
            drivesize.add(laptop.drivesize);
        }
        int k = 1;
        int choice = 0;
        Map<String, String> parameters = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (k != -1) {
            System.out.println("Выберите критерии фильтрации ноутбуков:\n" + 
            "1 - бренд\n" +
            "2 - процессор\n" +
            "3 - объем ОЗУ\n" +
            "4 - объем HDD\n" +
            "5 - макс цена\n" +
            "0 - вывести ноутбуки по критериям\n" +
            "-1 - вывести все ноутбуки");
            k = sc.nextInt();
            switch (k) {
                case 1:
                    System.out.println("Выберите бренд:");
                    printValuesOfParameter(brand);
                    choice = sc.nextInt();
                    parameters.put("brand", (new ArrayList<String>(brand).get(choice-1)));
                    printSelectedParameters(parameters);
                    break;
                case 2:
                    System.out.println("Выберите процессор:");
                    printValuesOfParameter(cpu);
                    choice = sc.nextInt();
                    parameters.put("cpu", (new ArrayList<String>(cpu).get(choice-1)));
                    printSelectedParameters(parameters);
                    break;
                case 3:
                    System.out.println("Выберите объем ОЗУ:");
                    printValuesOfParameter(ram);
                    choice = sc.nextInt();
                    parameters.put("ram", (new ArrayList<String>(ram).get(choice-1)));
                    printSelectedParameters(parameters);
                    break;
                case 4:
                    System.out.println("Выберите объем HDD:");
                    printValuesOfParameter(drivesize);
                    choice = sc.nextInt();
                    parameters.put("drivesize", (new ArrayList<String>(drivesize).get(choice-1)));
                    printSelectedParameters(parameters);
                    break;
                case 5:
                    System.out.println("Введите максимальную цену:");
                    sc.nextLine();
                    String maxprice = sc.nextLine();
                    parameters.put("price", maxprice);
                    printSelectedParameters(parameters);
                    break;
                case 0:
                    if (parameters.isEmpty())
                        System.out.println("Не выбрано ни одного критерия");
                    else 
                        return parameters;
                    break;
                case -1:
                    return null;
                default:
                    System.out.println("Введено неверное значение");
                    break;
            }
        }
        sc.close();
        return parameters;
    }

    public static void printValuesOfParameter(Set<String> set){
        int count = 1;
        for (String elem : set) {
            System.out.println(count++ + " - " + elem);
        }
    }

    public static void printSelectedParameters(Map<String, String> parameters){
        System.out.println("Выбраны критерии:");
        if (parameters.containsKey("brand"))
            System.out.println("Бренд: " + parameters.get("brand"));
        if (parameters.containsKey("cpu"))
            System.out.println("Процессор: " + parameters.get("cpu"));
        if (parameters.containsKey("ram"))
            System.out.println("Объем ОЗУ: " + parameters.get("ram"));
        if (parameters.containsKey("drivesize"))
            System.out.println("Объем HDD: " + parameters.get("drivesize"));
        if (parameters.containsKey("price"))
            System.out.println("Максимальная цена: " + parameters.get("price") + " рублей");
    }

    public static List<Laptops> getFoundLaptops(List<Laptops> laptops, Map<String, String> parameters){
        List<Laptops> foundLaptops = new ArrayList<>();
        for (int i = 0; i < laptops.size(); i++) {
            List<Boolean> flag = new ArrayList<>();
            if (parameters.containsKey("brand"))
                if (laptops.get(i).brand.equals(parameters.get("brand")))
                    flag.add(true);
                else
                    flag.add(false);
            if (parameters.containsKey("cpu"))
                if (laptops.get(i).cpu.equals(parameters.get("cpu")))
                    flag.add(true);
                else
                    flag.add(false);
            if (parameters.containsKey("ram"))
                if (laptops.get(i).ram.equals(parameters.get("ram")))
                    flag.add(true);
                else
                    flag.add(false);
            if (parameters.containsKey("drivesize"))
                if (laptops.get(i).drivesize.equals(parameters.get("drivesize")))
                    flag.add(true);
                else
                    flag.add(false);
            if (parameters.containsKey("price"))
                if (laptops.get(i).price <= Integer.valueOf(parameters.get("price")))
                    flag.add(true);
                else
                    flag.add(false);
            if (!flag.contains(false)){
                foundLaptops.add(laptops.get(i));
            }
        }
        return foundLaptops;
    }
    
    public static void printLaptops(List<Laptops> laptops){
        for (Laptops laptop : laptops) {
            System.out.printf("Ноутбук: %s, процессор: %s, объем ОЗУ: %s, объем HDD: %s, цена: %d рублей\n", 
            laptop.model, laptop.cpu, laptop.ram, laptop.drivesize, laptop.price);
        }
    }
}
