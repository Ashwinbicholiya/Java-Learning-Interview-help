/**
 * FiverSeries class extends the abstract class BMW.
 * 
 * Interview Questions:
 * 1. How does a class implement an abstract class?
 *    - A class provides concrete implementations for the abstract methods defined in the abstract class.
 * 
 * 2. What happens if a class does not implement all methods of the abstract class?
 *    - The class must be declared abstract if it does not implement all methods of the abstract class.
 * 
 * 3. Can you instantiate a class that extends an abstract class?
 *    - Yes, you can instantiate the class if it provides implementations for all methods of the abstract class.
 * 
 * 4. What is the purpose of the @Override annotation?
 *    - It indicates that a method is overriding a method from an abstract class or interface.
 */
public class FiverSeries extends BMW {

    @Override
    void accelerate() {
        System.out.println("FiverSeries is accelerating");
    }

    @Override
    void brake() {
        System.out.println("FiverSeries is braking");
    }

    /**
     * Main method to test FiverSeries.
     */
    public static void main(String[] args) {
        FiverSeries car = new FiverSeries();
        car.accelerate();
        car.brake();
    }
}