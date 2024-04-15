package src.main.java.io.codelex.oop.cars;

import java.util.List;

public class CarServiceTest {
    public static void main(String[] args) {
        CarService carService = new CarService();

        Manufacturer manufacturer1 = new Manufacturer("Toyota", 1937, "Japan");
        Manufacturer manufacturer2 = new Manufacturer("Ford", 1903, "USA");
        Car car1 = new Car("Corolla", "XLi", 25000, 2022, manufacturer1, Car.EngineType.S4);
        Car car2 = new Car("Camry", "SE", 35000, 2023, manufacturer2, Car.EngineType.V6);
        Car car3 = new Car("Fiesta", "S", 20000, 1998, manufacturer2, Car.EngineType.S3);

        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);

        List<Car> allCars = carService.getAllCars();
        System.out.println("\nAll cars: ");
        for (Car car : allCars) {
            System.out.println(car.getName());
        }

        List<Car> v6Cars = carService.getCarsWithEngineType(Car.EngineType.V6);
        System.out.println("\nCars with V6 engine: ");
        for (Car car : v6Cars) {
            System.out.println(car.getName());
        }

        List<Car> before1999Cars = carService.getCarsProducedBefore1999();
        System.out.println("\nCars produced before 1999: ");
        for (Car car : before1999Cars) {
            System.out.println(car.getName());
        }

        Car mostExpensiveCar = carService.getMostExpensiveCar();
        System.out.println("\nMost expensive car: " + mostExpensiveCar.getName());

        Car cheapestCar = carService.getCheapestCar();
        System.out.println("\nCheapest car: " + cheapestCar.getName());

        List<Car> carsWithMultipleManufacturers = carService.getCarsWithMultipleManufacturers();
        System.out.println("\nCars with at least 3 manufacturers: ");
        for (Car car : carsWithMultipleManufacturers) {
            System.out.println(car.getName());
        }

        List<Car> sortedCarsAsc = carService.getCarsSortedByPrice(true);
        System.out.println("\nCars sorted by price (ascending): ");
        for (Car car : sortedCarsAsc) {
            System.out.println(car.getName() + " - Price: " + car.getPrice());
        }
        List<Car> sortedCarsDesc = carService.getCarsSortedByPrice(false);
        System.out.println("\nCars sorted by price (descending): ");
        for (Car car : sortedCarsDesc) {
            System.out.println(car.getName() + " - Price: " + car.getPrice());
        }

        Car specificCar = new Car("Corolla", "XLi", 25000, 2022, manufacturer1, Car.EngineType.S4);
        boolean containsSpecificCar = carService.containsCar(specificCar);
        System.out.println("\nContains specific car: " + containsSpecificCar);

        List<Car> carsByManufacturer = carService.getCarsByManufacturer(manufacturer1);
        System.out.println("\nCars manufactured by " + manufacturer1.getName() + ": ");
        for (Car car : carsByManufacturer) {
            System.out.println(car.getName());
        }

        List<Car> carsByManufacturerAndYear = carService.getCarsByManufacturerAndYearComparison("<", 2000);
        System.out.println("\nCars manufactured by manufacturers established before 2000: ");
        for (Car car : carsByManufacturerAndYear) {
            System.out.println(car.getName());
        }

    }
}


