package Lab_2.Problem1.PartA;

import java.util.Scanner;

public class TestForShapes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cylinder radius: ");
        double cylinderRadius = sc.nextDouble();

        System.out.print("Enter cylinder height: ");
        double cylinderHeight = sc.nextDouble();

        System.out.print("Enter sphere radius: ");
        double sphereRadius = sc.nextDouble();

        System.out.print("Enter cube side: ");
        double cubeSide = sc.nextDouble();

        Shape3D cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        Shape3D sphere = new Sphere(sphereRadius);
        Shape3D cube = new Cube(cubeSide);

        System.out.println("\nResults:");
        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Cylinder surface area: " + cylinder.surfaceArea());

        System.out.println("Sphere volume: " + sphere.volume());
        System.out.println("Sphere surface area: " + sphere.surfaceArea());

        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube surface area: " + cube.surfaceArea());

        sc.close();
    }
}