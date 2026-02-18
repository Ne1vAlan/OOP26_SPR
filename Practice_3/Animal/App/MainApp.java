package Practice_3.Animal.App;

import Practice_3.Animal.Model.Animal;
import Practice_3.Animal.Model.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        System.out.println("=== Create 1 Animal object (as abstract type) ===");
        System.out.print("Enter name for Animal (will be Dog): ");
        String aName = sc.nextLine();
        System.out.print("Enter age: ");
        int aAge = readIntSafe(sc);
        System.out.print("Enter breed: ");
        String aBreed = sc.nextLine();

        Animal a1 = new Dog(aName, aAge, aBreed);
        animals.add(a1);

        System.out.println("\n=== Create 2 more Dog objects ===");
        for (int i = 1; i <= 2; i++) {
            System.out.println("Dog #" + i);
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = readIntSafe(sc);
            System.out.print("Enter breed: ");
            String breed = sc.nextLine();

            Dog dog = new Dog(name, age, breed);
            animals.add(dog); 
            System.out.println();
        }

        System.out.println("=== Polymorphism demo (List<Animal>) ===");
        for (Animal animal : animals) {
            System.out.println("\n----------------------");
            animal.getInfo();         
            animal.makeSound();     
            animal.eat();             
            animal.eat("meat");       
        }

        sc.close();
    }


    private static int readIntSafe(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Not a number. Try again: ");
            sc.nextLine();
        }
        int x = sc.nextInt();
        sc.nextLine();
        return x;
    }
}
