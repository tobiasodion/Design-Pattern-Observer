package ObserverPattern;

public class UkTimesObserver implements IObserver{

    @Override
    public void update(String message) {
        System.out.println("Live from UK Times Newspaper");
        System.out.println("Update received");
        System.out.println(message + "\n");
    }
}