package Lab_2.Problem2.Chess;

public class King extends Piece{

	public King(Position a) {
		super(a, 'K');
	}

	public boolean isLegalMove(Position b) {
		int dx = Math.abs(a.getRow() - b.getRow());
	    int dy = Math.abs(a.getCol() - b.getCol());
	    return dx <= 1 && dy <= 1;
	}
}
