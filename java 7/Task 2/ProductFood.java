public class ProductFood extends Product2 {

    public ProductFood(String name, int cost) {
        super(name, cost);
    }

    @Override
    protected String getInfo() {
        return String.format("ProductFood [name=%s, cost=%d]", super.getName(), super.getCost());
    }

    @Override
    public String toString() {
        return getInfo();
    }
    
}
