// Concrete Subject
public class NewsAgency implements NewsSubject {
    private String headline;
    private String description;
    private List<Subscriber> subscribers;

    // Getters and Setters
    public String getHeadline() {
        return headline;
    }
    
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    // Implementation of attach(), detach(), and notifySubscribers() methods
    @Override
    public void attach(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void detach(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public String notifySubscribers() {
        String output = new String();
        for(Subscriber s : subscribers) {
            output += "Hey, " + s.getSubscriberName() + "!\n";
            output += "Here are the latest news stories:\n";
            output += headline + ":\n" + description;
        }
        return output;
    }
}