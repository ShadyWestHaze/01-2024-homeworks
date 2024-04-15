package src.main.java.io.codelex.oop.imperialToMetric;

public enum ConversionType {
    METERS_TO_YARDS(new MeterToYardConverter()),
    YARDS_TO_METERS(new YardToMeterConverter()),
    CENTIMETERS_TO_INCHES(new CentimeterToInchConverter()),
    INCHES_TO_CENTIMETERS(new InchToCentimeterConverter()),
    KILOMETERS_TO_MILES(new KilometerToMileConverter()),
    MILES_TO_KILOMETERS(new MileToKilometerConverter());

    private final Converter CONVERTER;

    ConversionType(Converter converter) {
        this.CONVERTER = converter;
    }

    public Converter getConverter() {
        return CONVERTER;
    }
}

interface Converter {
    double convert(int value);
}

class MeterToYardConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 1.09361;
    }
}

class YardToMeterConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 0.9144;
    }
}

class CentimeterToInchConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 0.393701;
    }
}

class InchToCentimeterConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 2.54;
    }
}

class KilometerToMileConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 0.621371;
    }
}

class MileToKilometerConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 1.60934;
    }
}
