package chapter1.level2;

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
        ticketSeller.sellTo(audience);
    }
}
