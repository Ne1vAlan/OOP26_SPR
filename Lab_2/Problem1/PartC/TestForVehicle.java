package Lab_2.Problem1.PartC;

import java.util.HashSet;
import java.util.Scanner;

public class TestForVehicle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Car> cars = new HashSet<>();

        System.out.print("How many cars do you want to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for(int i = 0; i < n; i++) {

            System.out.println("\nEnter data for car " + (i+1));

            System.out.print("Brand: ");
            String brand = sc.nextLine();

            System.out.print("Year: ");
            int year = sc.nextInt();
            sc.nextLine();

            System.out.print("Model: ");
            String model = sc.nextLine();

            cars.add(new Car(brand, year, model));
        }

        System.out.println("\nNumber of unique cars: " + cars.size());

        sc.close();
    }
}