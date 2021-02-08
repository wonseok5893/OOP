### Level1
<pre>
<code>
    극장 -> 관중
        -> 가방
        -> 판매원 
        -> 매표소
    
    Theater theater = new Theator(
                            new TicketSeller(
                                    new TicketOffice(
                                            0, new Ticket(100),new Ticket(100))));
    // 이러한 영화관이 존재한다.
    
    Audience audience1 = new Audience(
                                new Bag(10000) 
                                        );
    
    // 초대장이 없고 현금만 있는 관중 
    Audience audience2 = new Audience(
                                new Bag(10000,
                                    new Invitation()) 
                                        );                                    
    //초대장과 현금이 있는 관중
                                        
    theater.enter( audience1 or audience2 )=>{
        
            if(audience.getBag().hasInvitation()){
                        // 초대장이 있으면 무료
                        Ticket ticket = ticketSeller.getTicketOffice().getTicket();
                        audience.getBag().setTicket(ticket);
                    }else{
                        //초대장이 없으면 유료
                        Ticket ticket = ticketSeller.getTicketOffice().getTicket();
                        audience.getBag().minusMoney(ticket.getFee());
                        ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
                        audience.getBag().setTicket(ticket);
                    }
    }
    // 극장이 판매원, 매표소에도 접근하고, 관중, 관중의 가방에도 접근한다. 
    -> 극장 객체는 다른 객체들을 많이 의존하고 있다. -> 결합도가 높다!  
    -> 결합도가 높다 -> 변경시에 많은 코드를 바꿔야 한다.                                             
</code>
</pre>