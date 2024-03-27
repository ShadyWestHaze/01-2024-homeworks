package src.main.java.io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private final List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCarsWithEngineType(Car.EngineType engineType) {
        return cars.stream()
                .filter(car -> car.getEngineType() == engineType)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public List<Car> getCarsWithMultipleManufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturer() != null)
                .filter(car -> car.getManufacturer().getName().split(",").length >= 3)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsSortedByPrice(boolean ascending) {
        Comparator<Car> comparator = Comparator.comparing(Car::getPrice);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        return cars.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    public boolean containsCar(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByManufacturerAndYearComparison(String comparisonOperator, int year) {
        switch (comparisonOperator) {
            case "<":
                return cars.stream()
                        .filter(car -> car.getManufacturer().getYearOfEstablishment() < year)
                        .collect(Collectors.toList());
            case ">":
                return cars.stream()
                        .filter(car -> car.getManufacturer().getYearOfEstablishment() > year)
                        .collect(Collectors.toList());
            case "<=":
                return cars.stream()
                        .filter(car -> car.getManufacturer().getYearOfEstablishment() <= year)
                        .collect(Collectors.toList());
            case ">=":
                return cars.stream()
                        .filter(car -> car.getManufacturer().getYearOfEstablishment() >= year)
                        .collect(Collectors.toList());
            case "=":
                return cars.stream()
                        .filter(car -> car.getManufacturer().getYearOfEstablishment() == year)
                        .collect(Collectors.toList());
            case "!=":
                return cars.stream()
                        .filter(car -> car.getManufacturer().getYearOfEstablishment() != year)
                        .collect(Collectors.toList());
            default:
                throw new IllegalArgumentException("Invalid comparison operator");
        }
    }
}
