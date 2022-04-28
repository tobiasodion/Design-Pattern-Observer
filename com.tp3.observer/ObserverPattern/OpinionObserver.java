package ObserverPattern;

public class OpinionObserver implements IObserver{

    @Override
    public void update(String message) {
        System.out.println("Live from L'Opinion Newspaper");
        System.out.println("Update received");
        System.out.println(message + "\n");
    }
}