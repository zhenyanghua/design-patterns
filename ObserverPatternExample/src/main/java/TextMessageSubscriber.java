// Concrete Subscriber
public class TextMessageSubscriber extends AbstractSubscriber {
    public TextMessageSubscriber(AbstractTopic topic) {
        this.topic = topic;
        this.topic.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Observer [" + hashCode() + "] updates: " + topic.getMessage());
    }
}
