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

### 절차지향과 객체지향 
이 코드는 절차지향적 프로그래밍에 가깝다.
- 모든 처리가 Theater 클래스에서 이루어지고 나머지 클래스는 데이터이기 때문이다. 

### 클린코드의 세가지 기능
1. 동작 시에 문제가 없다. (O)
2. 변경시, 단순한 작업으로 변경이 가능하다 (x)
3. 이해하기가 쉽다. (x) -> 영화관이 가방을 뒤져본다는 둥...