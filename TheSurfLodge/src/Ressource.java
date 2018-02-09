import java.time.LocalDateTime;

public class Ressource {

    String name;
    String description;
    int amount;
    LocalDateTime timeOfPurchase;

    public Ressource(String name, String description, int amount, LocalDateTime timeOfPurchase) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.timeOfPurchase = timeOfPurchase;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }
}
