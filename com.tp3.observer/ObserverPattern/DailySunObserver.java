package ObserverPattern;

public class DailySunObserver implements IObserver{

    @Override
    public void update(String message) {
        System.out.println("Live from Daily Sun Newspaper");
        System.out.println("Update received");
        System.out.println(message + "\n");
    }
}