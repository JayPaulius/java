public class Fahrenheit implements Converter {
    @Override
    public double convertValue(double value) {
        return value * 1.8 + 32;
    }
    
}
