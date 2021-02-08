package chapter1.level1;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, List<Ticket> tickets) {
        this.amount = amount;
        this.tickets = tickets;
    }

    /**
     * 티켓은 앞에서 부터 한장씩 준다고 가정하자
     * @return
     */
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
