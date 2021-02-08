# OOP 객체 지향 프로그래밍
> 책임과 권한을 가진 객체끼리 서로 메시지를 주고 받으며 협력해서 필요한 기능을 수행하도록 시스템을 개발하는 것

## 객체 사이의 의존 관계
   
## 이론 VS 실무
   1. 로버트 L. 글래스는 '이론 대 실무'라는 흥미로운 주제에 관한 개인적인 견해를 밝히고 있다.
        - 그의 결론은 이론보다 실무가 먼저다. 어느 분야든 초기 단계에서는 실무가 먼저 급속한 발전을 이룬다.  
        -> 건축처럼 역사가 오래된 여느 다른 공학 분야에 비해 상대적으로 짧은 소프트웨어 분야의 역사를 생각해보면
            소프트웨어 분야는 아직 걸음마 단계에 머물어 있기 때문에 이론보다 실무가 더 중요하다는 것이다.
            
## Clean Code
> 로버트 마틴이 소프트웨어 모듈이 가져야하는 세 가지 기능
> 1. 실행 중에 제대로 동작하는 것이다.
> 2. 변경을 위해 존재하는 것이다. -> 간단한 작업만으로도 변경이 가능해야 한다.
> 3. 이해하기 쉬워야 한다. -> 개발자가 쉽게 읽고 이해할 수 있어야 한다.
> 
### Chapter01 
1. 극장에서 티켓을 통해 입장하는 상황  
    1.1  티켓을 발급 받기 위해 초대장 or 현금이 필요하다.  

#### Level1    
   - 극장이 주도적으로 관중의 가방을 뒤져보고 매표소에 돈을 저장하고, 극장이 모든 일을 떠맡고 있다. 
 
