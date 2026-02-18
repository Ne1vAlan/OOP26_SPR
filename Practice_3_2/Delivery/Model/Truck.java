package Practice_3_2.Delivery.Model;

public class Truck extends Vehicle {

    private int maxLoad;

    public Truck(String model, double baseCost, Engine engine, int maxLoad) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }

    @Override
    public double calculateDeliveryCost() {
        return baseCost + (maxLoad * 2);
    }

    // OVERLOAD
    public double calculateDeliveryCost(double distance, double fuelPrice) {
        return calculateDeliveryCost() + (distance * fuelPrice);
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() +
               "\nMax load: " + maxLoad;
    }
}
