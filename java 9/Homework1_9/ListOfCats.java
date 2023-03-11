import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfCats implements Iterable<Cat>{
    private List<Cat> catList;
    
    public ListOfCats() {
        catList = new ArrayList<>();
    }

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    public void addCat(Cat cat){
        catList.add(cat);
    }

    @Override
    public Iterator<Cat> iterator() {
        return new ListOfCatsIterator(catList);
    }
}