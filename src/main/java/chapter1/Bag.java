package chapter1;

public class Bag {
    private Long money;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long money) {
        this.money = money;
    }

    public Bag(Invitation invitation) {
        this.invitation = invitation;
    }

    public boolean hasInvitation(){
        return invitation!=null;
    }

    public boolean hasTicket(){
        return ticket!=null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusMoney(Long amount){
        money-=amount;
    }

    public void plusMoney(Long amount){
        money+=amount;
    }
}
