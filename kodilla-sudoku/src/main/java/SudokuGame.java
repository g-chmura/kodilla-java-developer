public class SudokuGame {

    public static final String MENU = "Hello! This little program is a SUDOKU solver. " +
            "You can try to solve it yourself or just leave solving to computer by typing 'SOLVE'"+ '\n' +
            "Sample input: 1,2,3 - will put number 3 in column 1, row 2." +
            '\n' + "To exit type: EXIT"+'\n'+"Let's get started!";
    public static final String SET_INPUT_INFORMATION="Choose column number(1-9), row number(1-9) and number to put in that certain cell(1-9)" +
            " or type 'SOLVE' to start solving";
    private Board sudokuBoard = new Board();
    private Validator validator =new Validator(sudokuBoard);

    public Board getSudokuBoard() {
        return sudokuBoard;
    }

    public boolean setTheCell(String userInput) throws NumberFormatException{
        boolean isSet = true;
        String[] elementData = userInput.split(",");
        int columnIndex = Integer.parseInt(elementData[0]) - 1;
        int rowIndex = Integer.parseInt(elementData[1]) - 1;
        int elementValue = Integer.parseInt(elementData[2]);
        if(validator.userInputCheck(columnIndex, rowIndex, elementValue)) {
            if ((validator.columnValidator(columnIndex, rowIndex, elementValue)) &&
                    (validator.rowValidator(columnIndex, rowIndex, elementValue)) &&
                    (validator.positionValidator(columnIndex, rowIndex, elementValue))) {
                sudokuBoard.getBoard().get(rowIndex).getRow().get(columnIndex).setValue(elementValue);
                System.out.println("Your number has been placed in board");
                isSet=true;
            } else {
                System.out.println("Can't put: " + (elementValue) + " in cell: column: " + (columnIndex + 1) + ", row: " + (rowIndex + 1));
                isSet=false;
            }
        }
        return isSet;
    }

    public boolean resolvingValidator(int valColumnIndex, int valRowIndex, int elementValue){
        if (validator.columnValidator(valColumnIndex, elementValue) && validator.rowResElValidator(valRowIndex, elementValue) &&
                validator.positionValidator(valColumnIndex, valRowIndex, elementValue)) {
            sudokuBoard.getBoard().get(valRowIndex).getRow().get(valColumnIndex).setValue(elementValue);
            return true;
        }
        return false;
    }

    public void printBoard (){
        for (BoardRow r: sudokuBoard.getBoard())
            System.out.println(r);
    }

    public boolean resolveSudoku(Board sB) {
        for (int row=0;row<9;row++){
            for (int column=0; column<9; column++){
                if(sB.getBoard().get(row).getRow().get(column).getValue()==0) {
                    for (int e = 1; e < 10; e++) {
                        if (resolvingValidator(column, row, e) &&
                                resolveSudoku(sB)) {
                            return true;
                        }
                        sB.getBoard().get(row).getRow().get(column).setValue(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
