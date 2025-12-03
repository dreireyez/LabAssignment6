// Concrete Observer
public class Subscriber implements SubscriberObserver {
    private String subscriberName;

    // Getters and Setters
    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    // Implemented update() method
    @Override
    public void update() {

    }
}