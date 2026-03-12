package Lab_2.Problem2.Chess;

public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
    }

    public boolean isInside(Position p) {
        return p.getRow() >= 0 && p.getRow() < 8 &&
               p.getCol() >= 0 && p.getCol() < 8;
    }

    public void placePiece(Piece piece) {
        Position p = piece.getPosition();
        if (isInside(p)) {
            board[p.getRow()][p.getCol()] = piece;
        }
    }

    public Piece getPiece(Position p) {
        if (!isInside(p)) {
            return null;
        }
        return board[p.getRow()][p.getCol()];
    }

    public void drawBoard() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j].getSymbol() + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean movePiece(Position from, Position to) {
        if (!isInside(from) || !isInside(to)) {
            System.out.println("Position is outside the board.");
            return false;
        }

        Piece piece = getPiece(from);

        if (piece == null) {
            System.out.println("No piece at the starting position.");
            return false;
        }

        if (!piece.isLegalMove(to)) {
            System.out.println("Illegal move for this piece.");
            return false;
        }

        board[from.getRow()][from.getCol()] = null;
        piece.setPosition(to);
        board[to.getRow()][to.getCol()] = piece;

        return true;
    }
}