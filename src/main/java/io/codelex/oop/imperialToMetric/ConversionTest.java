package src.main.java.io.codelex.oop.imperialToMetric;

public class ConversionTest {
    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();

        System.out.println("10 meters to yards: " + converter.convert(10, ConversionType.METERS_TO_YARDS));
        System.out.println("10 yards to meters: " + converter.convert(10, ConversionType.YARDS_TO_METERS));
        System.out.println("10 centimeters to inches: " + converter.convert(10, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println("10 inches to centimeters: " + converter.convert(10, ConversionType.INCHES_TO_CENTIMETERS));
        System.out.println("10 kilometers to miles: " + converter.convert(10, ConversionType.KILOMETERS_TO_MILES));
        System.out.println("10 miles to kilometers: " + converter.convert(10, ConversionType.MILES_TO_KILOMETERS));
    }
}
