package chapter1.level3;

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

    // 도메인 로직
    public Long hold(Ticket ticket){
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;
        }else{
            minusMoney(ticket.getFee());
            setTicket(ticket);
            return ticket.getFee();
        }
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
