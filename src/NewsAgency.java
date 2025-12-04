// Concrete Subject

import java.util.List;
import java.util.*;

public class NewsAgency implements NewsSubject {
    private String headline;
    private String category;
    private String content;
    private List<Subscriber> subscribers = new ArrayList<>();

    // Getters and Setters
    public String getHeadline() {
        return headline;
    }
    
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public int getSubscriberCount() {
        return subscribers.size();
    }

    // Method to publish news articles
    public void publishNews(String headline, String category, String content) {
        System.out.println("BREAKING NEWS!");
        System.out.println("Headline: " + headline);
        System.out.println("Category: " + category);
        System.out.println(content);

        this.headline = headline;
        this.category = category;
        this.content = content;

        notifySubscribers();
    }
    
    // Implementation of attach(), detach(), and notifySubscribers() methods
    @Override
    public void attach(Subscriber s) {
        subscribers.add(s);
        System.out.println("ADDED: "+s.getSubscriberName()+ " to subscribers.");
    }

    @Override
    public void detach(Subscriber s) {
        if (subscribers != null) {
            subscribers.remove(s);
            System.out.println("REMOVED: " + s.getSubscriberName() + " from subscribers.");
        }
    }

    @Override
    public String notifySubscribers() {
        String output = new String();
        for(Subscriber s : subscribers) {
            output += "Hey, " + s.getSubscriberName() + "!\n";
            output += "Here are the latest news stories:\n";
            output += headline + ":\n" + content;
        }
        System.out.println("NOTIFIED: "+subscribers.size()+" subscribers.");
        return output;
    }
}