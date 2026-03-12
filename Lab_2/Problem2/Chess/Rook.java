package Lab_2.Problem2.Chess;

public class Rook extends Piece {

	public Rook(Position a) {
		super(a, 'R');
	}

	public boolean isLegalMove(Position b) {
		return a.getCol() == b.getCol() || a.getRow() == b.getRow();
	}
}
