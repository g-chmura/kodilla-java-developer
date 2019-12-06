import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<BoardCell> row = new ArrayList<>(9);

    public List<BoardCell> getRow() {
        return row;
    }

    @Override
    public String toString(){
        StringBuilder stringOfElements= new StringBuilder(" ");
        for (BoardCell cell : row) {
            stringOfElements.append(cell.toString());
        }
        return stringOfElements.toString();
    }
}
