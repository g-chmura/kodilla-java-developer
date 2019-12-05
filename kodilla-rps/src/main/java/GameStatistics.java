public class GameStatistics {
    private int userWins;
    private int computerWins;


    public int getUserWins() {
        return userWins;
    }

    public int getComputerWins() {
        return computerWins;
    }

    public int getWins(){
        if(userWins > computerWins){
            return userWins;
        }else{
            return computerWins;
        }
    }

    public void increaseUserWins() {
        userWins++;
    }

    public void increaseComputerWins() {
        computerWins++;
    }
}
