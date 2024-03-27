package src.main.java.io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public double convert(int value, ConversionType conversionType) {
        return conversionType.getConverter().convert(value);
    }
}
