package Practice_1;

import java.util.Scanner;

public class Pb_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double D = (b * b) - (4 * a * c);

        if (D < 0) {
            System.out.println("Discriminant is negative. No real roots");

        } else if ( D == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);

        } else {
            double sqrtD = Math.sqrt(D);

            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        sc.close();
    }
}
