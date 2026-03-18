package Practice_4.Problem3.Interfaces.main;

import Practice_4.Problem3.Interfaces.model.*;
import Practice_4.Problem3.Interfaces.services.App;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== GAME TEST ===");

        Game logic = new LogicGame();
        Game memory = new MemoryGame();

        App.getStatistics(logic);
        App.getStatistics(memory);

        System.out.println("\n=== IPHONE TEST ===");

        iPhone phone = new iPhone();

        phone.sell();
        phone.plugIn();
    }
}