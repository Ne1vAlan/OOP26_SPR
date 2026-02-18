package Practice_3_2.Delivery.Service;

import Practice_3_2.Delivery.Model.Vehicle;

import java.util.List;

public class DeliveryService {

    public void printAllVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println("-------------------");
            System.out.println(v.getVehicleInfo());
        }
    }

    public void calculateAllDeliveries(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(v.getClass().getSimpleName() +
                    " delivery cost: " + v.calculateDeliveryCost());
        }
    }

    public double calculateTotalCost(List<Vehicle> vehicles) {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.calculateDeliveryCost();
        }
        return total;
    }
}
