package A2;

public class VIPTicket extends Ticket {
    private double surcharge;   // = Aufpreis

    @Override
    public double getPrice() {
        return super.getPrice() + surcharge;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Aufpreis: " + surcharge);
    }

    // Getter & Setter
    public double getSurcharge() {
        return surcharge;
    }
    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }
}
