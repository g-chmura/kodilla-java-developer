import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameFinished = false;
        SudokuGame theGame = new SudokuGame();

        System.out.println(SudokuGame.MENU);

        while (!gameFinished){
            theGame.printBoard();
            System.out.println (SudokuGame.SET_INPUT_INFORMATION);
            String userInput = scanner.nextLine();
            userInput=userInput.toUpperCase();
            if (userInput.equals("SOLVE")){
                boolean sudokuSolved = theGame.resolveSudoku(theGame.getSudokuBoard());
                if(sudokuSolved){
                    theGame.printBoard();
                    System.out.println ("SUDOKU solved. " +
                            "\nIf you want to play one more time just push any button. " +
                            "\nIf you want to shut down program type: EXIT.");
                    userInput = scanner.nextLine();
                    userInput=userInput.toUpperCase();
                    if(!userInput.equals("EXIT")) {
                        theGame = new SudokuGame();
                    }else {
                        gameFinished=true;
                        System.out.println("See ya");
                    }
                }
            } else if (userInput.equals("EXIT")){
                gameFinished=true;
                System.out.println("See ya");
            } else {
                try {
                    theGame.setTheCell(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format. \nValid format: '1,3,4' " +
                            "\nIf you want to start solving type: SOLVE" +
                            "\nIf you want to shut down program type: EXIT.");
                }
            }
        }

        scanner.close();
    }
}
