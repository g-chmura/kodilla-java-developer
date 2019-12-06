import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardRow> board = new ArrayList<>(9);

    public Board() {
        for (int b=0; b<9; b++) {
            getBoard().add(new BoardRow());
            for (int r=0; r<9; r++) {
                getBoard().get(b).getRow().add(new BoardCell());
            }
        }
    }

    public List<BoardRow> getBoard() {
        return board;
    }

    @Override
    public String toString () {
        StringBuilder stringOfElements= new StringBuilder();
        for (BoardRow boardRow : board) {
            stringOfElements.append(boardRow.toString());
        }
        return stringOfElements.toString();
    }
}
