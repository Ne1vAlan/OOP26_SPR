package Lab_2.Problem2.Chess;

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();

        board.placePiece(new Rook(new Position(7, 0)));
        board.placePiece(new Bishop(new Position(7, 2)));
        board.placePiece(new Queen(new Position(7, 3)));
        board.placePiece(new King(new Position(7, 4)));
        board.placePiece(new Knight(new Position(7, 1)));
        board.placePiece(new Pawn(new Position(6, 4)));

        while (true) {
            board.drawBoard();

            System.out.println("\nEnter move: fromRow fromCol toRow toCol");
            System.out.println("Enter -1 to exit.");

            int fromRow = sc.nextInt();
            if (fromRow == -1) {
                break;
            }

            int fromCol = sc.nextInt();
            int toRow = sc.nextInt();
            int toCol = sc.nextInt();

            Position from = new Position(fromRow, fromCol);
            Position to = new Position(toRow, toCol);

            boolean moved = board.movePiece(from, to);

            if (moved) {
                System.out.println("Move completed.");
            } else {
                System.out.println("Move failed.");
            }

            System.out.println();
        }

        sc.close();
    }
}