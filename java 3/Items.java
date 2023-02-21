public class Items {
    private String name;
    private String country;
    private int volume;

    public Items() {
    }

    public Items(String name, String country, int volume) {
        this.name = name;
        this.country = country;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String prodName) {
        this.name = prodName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Items [name=" + name + ", country=" + country + ", volume=" + volume + "]";
    }
}
