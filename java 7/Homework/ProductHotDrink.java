public class ProductHotDrink extends Product3 {
    private int volume;
    private int temperature;

    public ProductHotDrink(String name, int volume, int temperature) {
        super(name);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "ProductHotDrink [name=" + super.getName() + ", volume=" + volume + ", temperature=" + temperature + "]";
    }
}
