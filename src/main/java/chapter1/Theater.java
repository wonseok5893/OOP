package chapter1;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 영화관이 관중을 넣는다? 관중은 수동적인 존재?
     * @param audience
     */
    public void enter(Audience audience){
        if(audience.getBag().hasInvitation()){
            // 관중이 초대장이 있으면 무료
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        }else{
            // 없으면 유료
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusMoney(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
