package Practice_4.Interfaces.services;

import Practice_4.Interfaces.model.*;

public class Restaurant {

    public boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();

        if (eater instanceof Person) {
            System.out.println("Processing payment");
        }

        return true;
    }
}