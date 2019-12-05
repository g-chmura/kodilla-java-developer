public class Rules {
    public boolean isDraw(Enum userChoice, Enum computerChoice){

        return userChoice == computerChoice;
    }

    public boolean isUserWin(Enum userChoice, Enum computerChoice){

        if(userChoice == MoveChoice.R && computerChoice == MoveChoice.S){
            return true;
        }
        if(userChoice == MoveChoice.P && computerChoice == MoveChoice.R){
            return true;
        }
        return userChoice == MoveChoice.S && computerChoice == MoveChoice.P;
    }
}
