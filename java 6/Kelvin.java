public class Kelvin implements Converter {
    @Override
    public double convertValue(double value) {
        return value + 273.15;
    }
}
