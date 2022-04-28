package ObserverPattern;

public class TribuneObserver implements IObserver{

    @Override
    public void update(String message) {
        System.out.println("Live from La Tribune Newspaper");
        System.out.println("Update received");
        System.out.println(message + "\n");
    }
}