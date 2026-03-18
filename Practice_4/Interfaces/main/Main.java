package Practice_4.Interfaces.main;

import Practice_4.Interfaces.model.*;
import Practice_4.Interfaces.services.Restaurant;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        Cat cat = new Cat();
        Student student = new Student("Alan");

        CanHavePizza randomEater = new CanHavePizza() {
            @Override
            public void eatPizza() {
                System.out.println("Anonymous guy eats pizza");
            }
        };

        System.out.println("=== Cat ===");
        restaurant.servePizza(cat);

        System.out.println("=== Student ===");
        restaurant.servePizza(student);

        System.out.println("=== Anonymous ===");
        restaurant.servePizza(randomEater);
    }
}