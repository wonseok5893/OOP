package chapter1.level3;

public class TicketSeller {
    TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }


    public void sellTo(Audience audience){
        ticketOffice.sellTicketTo(audience);
        }

}
