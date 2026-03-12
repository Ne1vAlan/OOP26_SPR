package Lab_2.Problem2.Chess;

public class Knight extends Piece{

	public Knight(Position a) {
		super(a, 'N');
	}

	public boolean isLegalMove(Position b) {
		int dx = Math.abs(a.getRow() - b.getRow());
	    int dy = Math.abs(a.getCol() - b.getCol());
	    return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
	}
}
