package Practice_1;

import java.util.Scanner;

public class Pb_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        double x = sc.nextDouble();

        System.out.println("Area: " + (x * x));
        System.out.println("Perimeter: " + (4 * x));
        System.out.println("Diagonal: " + (x * Math.sqrt(2)));

        sc.close();
    }
    
}
