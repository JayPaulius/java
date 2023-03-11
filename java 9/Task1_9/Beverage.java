import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Beverage implements Iterable<Ingredient> {
    public List<Ingredient> components;

    public Beverage() {
        components = new ArrayList<>();
    }

    public List<Ingredient> getComponents() {
        return components;
    }

    public void setComponents(List<Ingredient> components) {
        this.components = components;
    }

    public void addComponent(Ingredient component){
        components.add(component);
    }
    
    @Override
    public Iterator<Ingredient> iterator() {
        return new BeverageIterator(components);
    }
}
