package src.main.java.io.codelex.polymorphism.practice.exercise1;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {
    public static void main(String[] args) {
        Car[] cars = {new Toyota(), new McQueen(), new Bmw(), new Audi(), new Lexus(), new Tesla(),};

        for (int lap = 1; lap <= 10; lap++) {
            for (Car car : cars) {
                car.speedUp();
                car.slowDown();
                if (lap % 3 == 0) {
                    (car).useNitrousOxideEngine();
                }
            }
        }
        Car fastestCar = null;
        int maxSpeed = Integer.MIN_VALUE;
        for (Car car : cars) {
            int currentSpeed = car.getCurrentSpeed();
            if (currentSpeed > maxSpeed) {
                maxSpeed = currentSpeed;
                fastestCar = car;
            }
        }

        System.out.println("Fastest car is: " + fastestCar.getName() + " with speed: " + maxSpeed);
    }
}
