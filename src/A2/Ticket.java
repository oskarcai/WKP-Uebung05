package A2;

public class Ticket {
    private static int ticketsSold;
    private String event;
    private double basePrice;

    public Ticket() {
        ticketsSold++;
    }

    public void showInfo() {
        System.out.println("Event: " + event);
        System.out.println("Grundpreis: " + basePrice);
    }

    // Getter & Setter
    public static int getTicketssold() {
        return ticketsSold;
    }
    public double getPrice() {
        return basePrice;
    }
    public String getEvent() {
        return event;
    }
    public void setEvent(String event) {
        this.event = event;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
