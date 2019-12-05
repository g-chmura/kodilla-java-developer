import java.util.HashMap;
import java.util.Map;

public class KeyTranslator {
    public Enum translateKeyToGameChoice(String keyChoice) {
        Map<String, Enum> translateMap = new HashMap<>();
        translateMap.put("1", MoveChoice.R);
        translateMap.put("2", MoveChoice.P);
        translateMap.put("3", MoveChoice.S);
        return translateMap.get(keyChoice);
    }

    public String translateKeytoChoiceName(String keyChoice) {
        Map<String, String> translateMap = new HashMap<>();
        translateMap.put("1", "rock");
        translateMap.put("2", "paper");
        translateMap.put("3", "scissors");
        return translateMap.get(keyChoice);
    }
}
