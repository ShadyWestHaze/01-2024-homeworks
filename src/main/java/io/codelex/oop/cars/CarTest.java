package src.main.java.io.codelex.oop.cars;

public class CarTest {
    public static void main(String[] args) {
        Manufacturer mclaren = new Manufacturer("McLaren", 1963, "United Kingdom");
        Car car1 = new Car("570S", "Coupe", 200000, 2022, mclaren, Car.EngineType.V8);

        System.out.println("Car Name: " + car1.getName());
        System.out.println("Car Model: " + car1.getModel());
        System.out.println("Car Price: " + car1.getPrice());
        System.out.println("Car Year of Manufacture: " + car1.getYearOfManufacture());
        System.out.println("Car Manufacturer: " + car1.getManufacturer().getName());
        System.out.println("Car Engine Type: " + car1.getEngineType());

        car1.setName("720S");
        car1.setModel("Spider");
        car1.setPrice(300000);
        car1.setYearOfManufacture(2023);
        Manufacturer newManufacturer = new Manufacturer("McLaren", 1963, "United Kingdom");
        car1.setManufacturer(newManufacturer);
        car1.setEngineType(Car.EngineType.V12);

        System.out.println("\nAfter Setters:");
        System.out.println("Car Name: " + car1.getName());
        System.out.println("Car Model: " + car1.getModel());
        System.out.println("Car Price: " + car1.getPrice());
        System.out.println("Car Year of Manufacture: " + car1.getYearOfManufacture());
        System.out.println("Car Manufacturer: " + car1.getManufacturer().getName());
        System.out.println("Car Engine Type: " + car1.getEngineType());

        Car car2 = new Car("570S", "Coupe", 200000, 2022, mclaren, Car.EngineType.V8);
        System.out.println("\nEquality Test: " + car1.equals(car2));
        System.out.println("HashCode of car1: " + car1.hashCode());
        System.out.println("HashCode of car2: " + car2.hashCode());
    }
}
