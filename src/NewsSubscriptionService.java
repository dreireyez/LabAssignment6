public class NewsSubscriptionService {
    public static void main(String[] args) {
        
        // Creating news agency object
        NewsAgency agency = new NewsAgency();

        // Creating subscriber objects
        Subscriber ramil = new Subscriber();
        ramil.setSubscriberName("Ramil");

        Subscriber john = new Subscriber();
        john.setSubscriberName("John");

        Subscriber jermaine = new Subscriber();
        jermaine.setSubscriberName("Jermaine");

        // Adding subscribers to the news agency
        agency.attach(ramil);
        agency.attach(john);
        agency.attach(jermaine);

        // Publishing a news article
        agency.publishNews("New Tech Innovation", "Technology", "A groundbreaking tech innovation has been unveiled today.");

        // Removing a subscriber
        agency.detach(john);

        // Publishing another news article
        agency.publishNews("Global Economic Update", "Economy", "The global economy is showing signs of recovery after a challenging year.");
    }
}