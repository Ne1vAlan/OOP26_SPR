package Practice_1;

import java.util.Scanner;

public class Pb_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int x = sc.nextInt();

        if (x >= 95) {
            System.out.println("Your grade is A");
        } else if (x >= 90) {
            System.out.println("Your grade is A-");
        } else if (x >= 85) {
            System.out.println("Your grade is B+");
        } else if (x >= 80) {
            System.out.println("Your grade is B");
        } else if (x >= 75) {
            System.out.println("Your grade is B-");
        } else if (x >= 70) {
            System.out.println("Your grade is C+");
        } else if (x >= 65) {
            System.out.println("Your grade is C");
        } else if (x >= 60) {
            System.out.println("Your grade is C-");
        } else if (x >= 50) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }

        sc.close();
    }
}
