public class UserChoices {
    public boolean isUserChoiceCorrect(String userChoice) {
        switch (userChoice) {
            case "1":
            case "2":
            case "3":
            case "x":
            case "n":
                return true;
            default:
                return false;
        }
    }
    public boolean continueGame(String userChoice) {
        switch (userChoice) {
            case "1":
            case "2":
            case "3":
                return true;
            default:
                return false;
        }
    }
}
