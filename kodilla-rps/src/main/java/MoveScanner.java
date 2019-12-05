import java.util.Scanner;

public class MoveScanner {
    private Scanner scanner;
    private static MoveScanner ourInstance = new MoveScanner();

    public static MoveScanner getInstance() {
        return ourInstance;
    }

    private MoveScanner() {
        scanner = new Scanner(System.in);
    }

    public String next(){
        return scanner.next();
    }
    public int nextInt(){
        return scanner.nextInt();
    }
    public void close(){
        scanner.close();
    }
}
