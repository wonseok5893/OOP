#### Level3

<pre>
<code>
    Bag.hold();
    ticketOffice.sellTicketTo();
    -> 두 메서드를 통해 도메인 자율적으로 처리하는 로직을 분리해봤다. -> 자율성 높인다.
    -> ticektSeller 는 ticketOffice의 인터페이스 (메소드)에만 의존하게 되었다.
</code>
</pre>

## 트레이드오프

    판매원 -> 매표소 -> 관중
          -> 관중
    
    TicketOffice의 자율성을 만족시켰지만 Audience의 결합도가 높아졌다  
    
> 1. 어떤 기능을 설계하는 방법은 한가지 이상이다.  
      단지, 트레이드 오프의 산물이다. 

#### 실생활과 객체지향
    극장, 가방, 매표소는 자율적인 존재가 아니다.
    하지만, 객체지향에서는 자율적인 존재로 취급한 것이다.
    -> 의인화! (레베카 워프스브록)    
    
### 설계가 왜 필요?
   1. 코드로 구현하는 방법은 여러가지다 즉 설계방법도 여러가지다.
   -> 설계가 코드를 작성하는 것보다 높은 차원의 창조적인 행위가 아니다. 
   -> 설계도 코드 작성의 일부이다.
   
   2. 좋은 설계란?
        1. 쉽게 변경할 수 있는 설계
   -> 요구사항은 항상 변한다. 즉, 변화에 유연한 설계가 필요하다.
        2. 이해하기 쉬운 코드
        
<pre>
<code>
        ticketSeller -> audience (buy)
        ticketSeller -> bag (minusAmount)
        
        극장 입장 기능을 이렇게 객체간의 상호작용으로 구현했다.
        
        ticketSeller -> audience(buy) -> bag(minusAmount)
       
</code>
</pre>     