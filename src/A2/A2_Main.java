package A2;

public class A2_Main {
    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        ticket.setEvent("24h race");
        ticket.setBasePrice(40.0);
        System.out.println("Normalticket-Preis: " + ticket.getPrice());

        VIPTicket vipTicket = new VIPTicket();
        vipTicket.setEvent(ticket.getEvent());
        vipTicket.setBasePrice(ticket.getBasePrice());
        vipTicket.setSurcharge(70.0);
        System.out.println("VIPTicket-Preis: " + vipTicket.getPrice());

        PlatinumTicket platinumTicket = new PlatinumTicket();
        platinumTicket.setEvent(ticket.getEvent());
        platinumTicket.setBasePrice(ticket.getBasePrice());
        platinumTicket.setSurcharge(vipTicket.getSurcharge());
        System.out.println("Platinumticket-Preis: " + platinumTicket.getPrice());

        System.out.println("Insgesamt verkaufte Ticketanzahl: " + Ticket.getTicketssold());
    }
}
