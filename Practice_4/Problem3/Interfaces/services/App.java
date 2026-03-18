package Practice_4.Problem3.Interfaces.services;

import Practice_4.Problem3.Interfaces.model.Game;

public class App {

    public static void getStatistics(Game g) {
        System.out.println("Game stats:");

        g.a();
        g.b();
        g.c();

        System.out.println("----------------");
    }
}