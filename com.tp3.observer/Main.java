import ObserverPattern.*;

public class Main {
    public static void main(String[] args) {
        MessagePublisher newsPublisher = new MessagePublisher();

        OpinionObserver opinion = new OpinionObserver();
        TribuneObserver tribune = new TribuneObserver();
        DailySunObserver dailySun = new DailySunObserver();
        UkTimesObserver ukTimes = new UkTimesObserver();
        VanguardObserver vanguard = new VanguardObserver();

        newsPublisher.attach(opinion);
        newsPublisher.attach(tribune);
        newsPublisher.attach(dailySun);
        newsPublisher.attach(ukTimes);
        newsPublisher.attach(vanguard);

        newsPublisher.notifyUpdate("The war in Ukraine Continues");
    }
}
