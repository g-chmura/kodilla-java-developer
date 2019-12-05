public class GameHolder {
    private MoveScanner scannerSingleton = MoveScanner.getInstance();


    public void processUserChoice(String userChoice, Settings gameSettings) {
        switch (userChoice) {
            case "x":
                System.out.println(LocaleManager.messages.getString("ask for finish game"));
                if (scannerSingleton.next().equals("y")) {
                    finishGame();
                }
                break;
            case "n":
                System.out.println(LocaleManager.messages.getString("ask for new game"));
                if (scannerSingleton.next().equals("y")) {
                    startNewGame(gameSettings);
                }
                break;
        }

    }

    private void finishGame() {
        System.exit(0);
    }

    private void startNewGame(Settings gameSettings) {
        Processor gameProcessor = new Processor(gameSettings);
        gameProcessor.process();
    }
}
