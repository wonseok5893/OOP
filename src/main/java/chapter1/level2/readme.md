#### Level 2

<pre>
<code>
    ticketSeller.getTicketOffice();
    audience.getBag(); 
    -> 두 메소드를 지우고 해당 도메인에서 처리하는 메소드를 작성하였다.
    ticketSeller.sellTo();
    audience.buy();
    
    -> 이로 인해 theater 객체는 ticketSeller 와 audience에만 접근 가능해졌다. -> 결합도를 낮췄다.
    -> ticketOffice는 ticketSeller 이외에는 접근이 불가능하다. -> 캡슐화
    -> bag도 audience 이외에는 접근이 불가능하다. -> 캡슐화
    
    
    극장 -> 판매원 -> 매표소 -> 티켓
                 -> 관중 -> 가방 
                 
    모든 책임은 극장에 존재했다 -> 판매원, 관중 도메인으로 책임을 이동시킴 (책임의 이동)             
    
</code>
</pre>

#### 핵심
>1.  객체 내부의 상태를 캡슐화하고 객체 간에 오직 메시지를 통해서만 상호작용하도록 만드는 것!  
>2.  불필요한 의존성을 제거해라!