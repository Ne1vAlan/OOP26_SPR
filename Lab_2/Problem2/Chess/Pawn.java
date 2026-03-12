package Lab_2.Problem2.Chess;

public class Pawn extends Piece{

	public Pawn(Position a) {
		super(a, 'P');
	}

	public boolean isLegalMove(Position b) {
		return b.getRow() == a.getRow() - 1 &&
		           b.getCol() == a.getCol();
	}
}
