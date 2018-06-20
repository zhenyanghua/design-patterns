import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Topic
public abstract class AbstractTopic implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(final Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(final Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    protected abstract Serializable getMessage();

    protected abstract void publish(Serializable message);
}
