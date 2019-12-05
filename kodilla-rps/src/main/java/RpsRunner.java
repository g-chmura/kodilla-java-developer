public class RpsRunner {
    public static void main(String[] args) {
        LocaleManager localeManager = new LocaleManager();
        localeManager.getLocalFromUser();

        GameInitialization gameInit = new GameInitialization();
        Gamer gamer = new Gamer(gameInit.getUserName());
        int roundsNumber = gameInit.getRoundsNumber();

        Settings gameSettings = new Settings(gamer.getNickname(), roundsNumber);
        Processor gameProcessor = new Processor(gameSettings);
        gameProcessor.process();
    }
}
