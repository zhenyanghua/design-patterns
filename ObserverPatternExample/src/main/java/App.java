public class App {
    public static void main(String[] args) {
        AbstractTopic topic1 = new TextMessageTopic();

        AbstractSubscriber subscriber1 = new TextMessageSubscriber(topic1);
        AbstractSubscriber subscriber2 = new TextMessageSubscriber(topic1);

        topic1.publish("Foo Bar.");

        topic1.detach(subscriber1);

        topic1.publish("Kuu Goo");

        AbstractTopic topic2 = new TextMessageTopic();

        new TextMessageSubscriber(topic2);
        new TextMessageSubscriber(topic2);

        topic2.publish("Moo Loo");
    }
}
