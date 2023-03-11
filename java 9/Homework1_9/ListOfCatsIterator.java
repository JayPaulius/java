import java.util.Iterator;
import java.util.List;

public class ListOfCatsIterator implements Iterator<Cat> {
    private List<Cat> catList;
    private int index;
    
    public ListOfCatsIterator(List<Cat> catList){
        this.catList = catList;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < catList.size();
    }

    @Override
    public Cat next() {
        return catList.get(index++);
    }
}