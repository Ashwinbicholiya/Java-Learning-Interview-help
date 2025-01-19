/**
 * FiverSeries class extends BMW and implements its abstract methods.
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