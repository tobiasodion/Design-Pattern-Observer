package ObserverPattern;

public interface IPublisher {
    public void attach(IObserver o);

    public void detach(IObserver o);

    public void notifyUpdate(String m);
}
