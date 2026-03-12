package Lab_2.Problem2.Chess;

public class Queen extends Piece {

    public Queen(Position a) {
        super(a, 'Q');
    }

    @Override
    public boolean isLegalMove(Position b) {

        if( a.getRow() == b.getRow() || a.getCol() == b.getCol())
            return true;

        if(Math.abs(a.getRow() - b.getRow()) == Math.abs(a.getCol() - b.getCol()))
            return true;

        return false;
    }
}