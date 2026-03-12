package Lab_2.Problem1.PartB;

import java.util.Scanner;

public class TestForLibraryItem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter publication year: ");
        int year = sc.nextInt();

        System.out.print("Enter number of pages: ");
        int pages = sc.nextInt();

        Book b1 = new Book(title, author, year, pages);

        System.out.println("\nBook information:");
        System.out.println(b1);

        sc.close();
    }
}