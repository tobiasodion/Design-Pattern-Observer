package ObserverPattern;

import java.util.*;

public class MessagePublisher implements IPublisher {
    List<IObserver> observers = new ArrayList<IObserver>();

    @Override
    public void attach(IObserver o) {
        if(observers.contains(o)){
            return;
        }
        
        observers.add(o);  
    }

    @Override
    public void detach(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(String m) {
      for (IObserver observer : observers){
          observer.update(m);
      }
    }
    
}
