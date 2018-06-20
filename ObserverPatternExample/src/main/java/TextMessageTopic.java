import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Queue;

// Concrete Topic
public class TextMessageTopic extends AbstractTopic {
    private Queue<Serializable> textMessageQueue = new ArrayDeque<>();

    @Override
    public Serializable getMessage() {
        return textMessageQueue.peek();
    }

    @Override
    public void publish(final Serializable message) {
        textMessageQueue.add(message);
        notifyObservers();
        textMessageQueue.poll();
    }
}
