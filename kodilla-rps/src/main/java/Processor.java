public class Processor {
    private Settings gameSettings;
    private MoveScanner scannerSingleton = MoveScanner.getInstance();

    public Processor(Settings gameSettings) {
        this.gameSettings = gameSettings;
    }

    public void process() {
        GameStatistics gameStatistics = new GameStatistics();
        boolean endGame = false;
        while (!endGame) {
            GameExecutor roundExecutor = new GameExecutor(gameSettings, gameStatistics);
            roundExecutor.prepareRound();
            roundExecutor.executeRound();
            roundExecutor.finishRound();
            if (gameStatistics.getWins() == gameSettings.getRoundNumber()) {
                endGame = true;
                scannerSingleton.close();
            }
        }
    }
}
