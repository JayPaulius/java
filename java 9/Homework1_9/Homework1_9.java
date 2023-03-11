public class Homework1_9 {
    public static void main(String[] args) {
        ListOfCats listIterator = new ListOfCats();
        listIterator.addCat(new Cat("cat1", 3));
        listIterator.addCat(new Cat("cat2", 2));
        listIterator.addCat(new Cat("cat3", 1));
        printList("ListIterator", listIterator);
        
        ListOfCats listComparator = new ListOfCats();
        listComparator.addCat(new Cat("cat1", 3));
        listComparator.addCat(new Cat("cat3", 2));
        listComparator.addCat(new Cat("cat2", 1));
        listComparatorAge(listComparator);
        listComparatorName(listComparator);
    }
    
    public static void listComparatorAge(ListOfCats listComparator){
        printList("\nИсходный список:", listComparator);
        listComparator.getCatList().sort(new AgeComparator());
        printList("\nAge comparator:", listComparator);
    }

    public static void listComparatorName(ListOfCats listComparator){
        printList("\nИсходный список:", listComparator);
        listComparator.getCatList().sort(new NameComparator());
        printList("\nName comparator:", listComparator);
    }

    public static void printList(String title, ListOfCats listComparator){
        System.out.println(title);
        for (Cat cat : listComparator) {
            System.out.println(cat);
        }
    }
}
