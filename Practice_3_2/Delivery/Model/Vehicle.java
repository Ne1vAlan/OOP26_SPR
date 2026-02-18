package Practice_3_2.Delivery.Model;

public abstract class Vehicle {

    protected String model;
    protected double baseCost;
    protected Engine engine; 

    public Vehicle(String model, double baseCost, Engine engine) {
        this.model = model;
        this.baseCost = baseCost;
        this.engine = engine;
    }

    public double calculateDeliveryCost() {
        return baseCost; 
    }

    public String getVehicleInfo() {
        return "Model: " + model +
               "\nBase cost: " + baseCost +
               "\n" + engine.getEngineInfo();  
    }
}
