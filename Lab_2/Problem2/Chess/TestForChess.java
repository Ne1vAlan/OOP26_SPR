package Lab_2.Problem2.Chess;

import java.util.Scanner;

public class TestForChess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start X: ");
        int startX = sc.nextInt();

        System.out.print("Enter start Y: ");
        int startY = sc.nextInt();

        System.out.print("Enter end X: ");
        int endX = sc.nextInt();

        System.out.print("Enter end Y: ");
        int endY = sc.nextInt();

        Position start = new Position(startX, startY);
        Position end = new Position(endX, endY);

        Piece rook = new Rook(start);

        if (rook.isLegalMove(end)) {
            System.out.println("Legal move");
        } else {
            System.out.println("Illegal move");
        }

        sc.close();
    }
}