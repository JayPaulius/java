public class Human extends Buyer {

    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder() {
        super.isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        super.isTakeOrder = true;
    }

    @Override
    public boolean getIsMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean getIsTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    String getName(){
        return super.name;
    }

    @Override
    public String toString() {
        return "Human [" + "name = " + this.name + ", isMakeOrder = " + super.isMakeOrder + ", isTakeOrder = " + super.isTakeOrder + "]";
    }
    
}