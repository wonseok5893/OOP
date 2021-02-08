package chapter1.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket...tickets) {
        this.amount = amount;
        this.tickets = Arrays.asList(tickets);
    }

    //도메인 로직
    public void sellTicketTo(Audience audience){
        plusAmount(audience.buy(getTicket()));
    }

    public Ticket getTicket(){
        return tickets.remove(0);
    }

    public void plusAmount(Long amount){
        this.amount+=amount;
    }

    public void minusAmount(Long amount){
        this.amount-=amount;
    }


}
