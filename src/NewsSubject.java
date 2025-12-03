// Subject Interface
public interface NewsSubject {
    void attach(Subscriber s);
    void detach(Subscriber s);
    void notifySubscribers();
}
