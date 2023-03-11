import java.util.Iterator;
import java.util.List;

public class BeverageIterator implements Iterator<Ingredient> {
    public List<Ingredient> components;
    int index;

    public BeverageIterator(List<Ingredient> components) {
        this.components = components;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Ingredient next() {
        return components.get(index++);
    }
}
