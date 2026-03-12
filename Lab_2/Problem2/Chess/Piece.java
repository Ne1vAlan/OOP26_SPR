package Lab_2.Problem2.Chess;

public abstract class Piece {
    protected Position a;
    protected char symbol;

    public Piece(Position a, char symbol) {
        this.a = a;
        this.symbol = symbol;
    }

    public Position getPosition() {
        return a;
    }

    public void setPosition(Position a) {
        this.a = a;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract boolean isLegalMove(Position b);
}