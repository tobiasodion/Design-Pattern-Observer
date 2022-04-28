package ObserverPattern;

public class VanguardObserver implements IObserver{

    @Override
    public void update(String message) {
        System.out.println("Live from Vanguard Newspaper");
        System.out.println("Update received");
        System.out.println(message + "\n");
    }
}