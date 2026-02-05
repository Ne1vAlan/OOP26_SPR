package Practice_2.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first time:");

        System.out.print("Hours: ");
        int h1 = sc.nextInt();

        System.out.print("Minutes: ");
        int m1 = sc.nextInt();

        System.out.print("Seconds: ");
        int s1 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);

        System.out.println("\nFirst time:");
        System.out.println("Universal: " + t1.toUniversal());
        System.out.println("Standard: " + t1.toStandard());


        System.out.println("\nEnter second time:");

        System.out.print("Hours: ");
        int h2 = sc.nextInt();

        System.out.print("Minutes: ");
        int m2 = sc.nextInt();

        System.out.print("Seconds: ");
        int s2 = sc.nextInt();

        Time t2 = new Time(h2, m2, s2);


        t1.add(t2);

        System.out.println("\nAfter adding:");
        System.out.println("Universal: " + t1.toUniversal());
        System.out.println("Standard: " + t1.toStandard());

        sc.close();
    }
}
