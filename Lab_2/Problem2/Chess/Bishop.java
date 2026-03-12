package Lab_2.Problem2.Chess;

public class Bishop extends Piece{

	public Bishop(Position a) {
		super(a, 'B');
	}

	public boolean isLegalMove(Position b) {
		int dx = Math.abs(a.getRow() - b.getRow());
	    int dy = Math.abs(a.getCol() - b.getCol());
	    return dx == dy;
	}

}
