public class Application {
    public static void main(String[] args) {
        Subject subject = (Subject)SetterProtectionProxy.newInstance(new RealSubject("Climate Change"));
        System.out.println(subject.getName());
        System.out.println("The next instruction will throw an IllegalAccessException from the proxy class");
        subject.setName("Bear Market");
    }
}
