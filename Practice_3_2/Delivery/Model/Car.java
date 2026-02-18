package Practice_3_2.Delivery.Model;

public class Car extends Vehicle {

    private int numberOfSeats;

    public Car(String model, double baseCost, Engine engine, int numberOfSeats) {
        super(model, baseCost, engine);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateDeliveryCost() {
        return baseCost + (numberOfSeats * 10);
    }

    // OVERLOAD
    public double calculateDeliveryCost(double extraWeight) {
        return calculateDeliveryCost() + extraWeight * 5;
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() +
               "\nSeats: " + numberOfSeats;
    }
}
