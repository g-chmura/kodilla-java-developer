import java.util.stream.Collectors;

public class Validator {

    private Board board;

    public Validator(Board board) {
        this.board = board;
    }

    public boolean userInputCheck (int columnNumber, int rowNumber, int elementValue){
        if ((columnNumber>8||columnNumber<0)||(rowNumber>8||rowNumber<0)||(elementValue>9||elementValue<1)){
            System.out.println("One of your numbers doesn't match (column, row or value). Try again with numbers in range 1-9");
            return false;
        }
        return true;
    }

    public boolean columnValidator(int columnNumber, int rowNumber, int elementValue){
        boolean elementValueChecked=false;
        for (int rowIndex=0 ; rowIndex<9; rowIndex++) {
            if (board.getBoard().get(rowIndex).getRow().get(columnNumber).getValue() == elementValue) {
                System.out.println("Invalid value (" + elementValue + ") in column: " + (columnNumber + 1) + ", row: " + (rowNumber + 1) + '\n'
                        + "This value has already been put in that column.Try something else.");
                elementValueChecked = false;
                break;
            } else {
                elementValueChecked = true;
            }
        }
        return elementValueChecked;
    }

    public boolean rowValidator(int columnNumber, int rowNumber, int elementValue){
        BoardRow boardRow = board.getBoard().get(rowNumber);
        if(boardRow.getRow().stream().map(BoardCell::getValue).collect(Collectors.toList()).contains(elementValue)){
            System.out.println("Invalid value (" + elementValue + ") in column: " + (columnNumber + 1) + ", row: " + (rowNumber + 1) + '\n'
                    + "This value has already been put in that row. Try something else.");
            return false;
        } return true;
    }

    private boolean checkColumnsInSquere(int rowToCheck, int columnToCheck, int elemntValue){
        return board.getBoard().get(rowToCheck).getRow().get(columnToCheck).getValue() == elemntValue;
    }

    public boolean positionValidator(int valColumnIndex, int valRowIndex, int elementValue){
        boolean elementValueChecked=true;
        if ((valColumnIndex==0 || valColumnIndex==3 || valColumnIndex==6) &&
                (valRowIndex==0||valRowIndex==3 ||valRowIndex==6)){
            for (int r = valRowIndex+1; r<(valRowIndex+3); r++){
                if (checkColumnsInSquere(r,(valColumnIndex+1),elementValue)||
                        checkColumnsInSquere(r,(valColumnIndex+2),elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((valColumnIndex==1 || valColumnIndex==4 || valColumnIndex==7) &&
                (valRowIndex==1|| valRowIndex==4 || valRowIndex==7)){
            for(int r = valRowIndex-1; r<(valRowIndex+2); r+=2) {
                if (checkColumnsInSquere(r,valColumnIndex-1,elementValue)||
                        checkColumnsInSquere(r,valColumnIndex+1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((valColumnIndex==2 ||valColumnIndex==5 ||valColumnIndex==8) &&
                (valRowIndex==2||valRowIndex==5 ||valRowIndex==8)){
            for(int r = valRowIndex-2; r<valRowIndex; r++) {
                if (checkColumnsInSquere(r,valColumnIndex-2,elementValue)||
                        checkColumnsInSquere(r,valColumnIndex-1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if((valColumnIndex==0 ||valColumnIndex==3 ||valColumnIndex==6) &&
                (valRowIndex==1||valRowIndex==4 ||valRowIndex==7)) {
            for(int r = valRowIndex-1; r<valRowIndex+2; r+=2) {
                if (checkColumnsInSquere(r,valColumnIndex+1,elementValue)||
                        checkColumnsInSquere(r,valColumnIndex+2,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((valColumnIndex==0 ||valColumnIndex==3 ||valColumnIndex==6) &&
                (valRowIndex==2||valRowIndex==5 ||valRowIndex==8)){
            for(int r = valRowIndex-2; r<valRowIndex; r++) {
                if (checkColumnsInSquere(r,valColumnIndex+1,elementValue)||
                        checkColumnsInSquere(r,valColumnIndex+2,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((valColumnIndex==1 ||valColumnIndex==4 ||valColumnIndex==7) &&
                (valRowIndex==0||valRowIndex==3 ||valRowIndex==6)) {
            for(int r = valRowIndex+1; r<valRowIndex+3; r++) {
                if (checkColumnsInSquere(r,valColumnIndex-1,elementValue)||
                        checkColumnsInSquere(r,valColumnIndex+1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((valColumnIndex==1 ||valColumnIndex==4 ||valColumnIndex==7) &&
                (valRowIndex==2||valRowIndex==5 ||valRowIndex==8)){
            for(int r = valRowIndex-2; r<valRowIndex; r++) {
                if (checkColumnsInSquere(r,valColumnIndex-1,elementValue)||
                        checkColumnsInSquere(r,valColumnIndex+1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((valColumnIndex==2 || valColumnIndex==5 ||valColumnIndex==8) &&
                (valRowIndex==0||valRowIndex==3 ||valRowIndex==6)){
            for(int r = valRowIndex+1; r<valRowIndex+3; r++) {
                if (checkColumnsInSquere(r,valColumnIndex-2,elementValue)||
                        checkColumnsInSquere(r,valColumnIndex-1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((valColumnIndex==2 ||valColumnIndex==5 ||valColumnIndex==8) &&
                (valRowIndex==1||valRowIndex==4 ||valRowIndex==7)) {
            for(int r = valRowIndex-1; r<valRowIndex+2; r+=2) {
                if (checkColumnsInSquere(r,valColumnIndex-2,elementValue) ||
                        checkColumnsInSquere(r,valColumnIndex-1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        }
        return elementValueChecked;
    }

    public boolean columnValidator(int valColumnIndex, int elementValue){
        boolean validated = true;
        for (int rowIndex=0 ; rowIndex<9; rowIndex++) {
            if (board.getBoard().get(rowIndex).getRow().get(valColumnIndex).getValue() == elementValue) {
                validated= false;
                break;
            }
        }
        return validated;
    }

    public boolean rowResElValidator(int valRowIndex, int elementValue){
        BoardRow boardRow = board.getBoard().get(valRowIndex);
        return !boardRow.getRow().stream().map(BoardCell::getValue).collect(Collectors.toList()).contains(elementValue);
    }
}
