package Practice_3_2.Delivery.App;

import Practice_3_2.Delivery.Model.*;
import Practice_3_2.Delivery.Service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Engine engine1 = new Engine("Petrol", 150);
        Engine engine2 = new Engine("Diesel", 300);

        Car car = new Car("Toyota Camry", 1000, engine1, 5);
        Truck truck = new Truck("MAN Truck", 2000, engine2, 1000);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);

        DeliveryService service = new DeliveryService();

        service.printAllVehicles(vehicles);
        service.calculateAllDeliveries(vehicles);

        double total = service.calculateTotalCost(vehicles);
        System.out.println("\nTotal delivery cost: " + total);
    }
}
