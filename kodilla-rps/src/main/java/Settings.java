public class Settings {
    private final String userName;
    private final int roundNumber;

    public Settings(String userName, int roundNumber) {
        this.userName = userName;
        this.roundNumber = roundNumber;
    }

    public int getRoundNumber() {
        return roundNumber;
    }
}
