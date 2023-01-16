# JAVA
JAVA skill up
##### 0112 메모리와 자료구조
(스택)   
메소드, for , if 안에 선언된것  
차곡차곡 쌓인다. 함수안에 선언된 변수  
메서드는 호출을 통해 실행이 된다. 호출되는 시점에 변수가 생성이 된다. 끝날때 선언된 변수가 없어진다  
ex) main메소드 args, n, d , p  

(힙)  
OS한테 "나 이만큼 쓸꺼야 줘" 라고 요청하는것  
프로그램 종료시 메모리를 회수해줘야 한다. 그렇지 않으면 메모리가 누수가 일어난다  
서버는 거의 끄지않기때문에 특정 어플리케이션에서 메모리를 해제하는 코드가 누락되었다면 메모리가 누수된다  
자바는 garbage collector가 해준다  
ex) Person클래스 안에꺼 할당 (호출해와서 실행)  
TempClass tc = new TempClass(); //Heap영역에 Tempclass 할당 tc는 메서드 안에있는 지역변수라서 stack에 담겨져 있다  

(메서드 area)  
static 전역? 개념 프로그램 시작시 메모리가 할당 아무리 new를 하더라도 생성되지않고 하나의 변수를 공유하는 개념  
프로그램이 시작되면 class는 메서드 에어리어에 로드된다 그 시점에 그 안에있는 static변수는 메서드 에어리어중에  
tempclass 영역에 메모리가 할당된다  
static변수는 클래스명이랑 래퍼런스 둘다 접근 가능  
생성된 객체 사이에 공유하라는 의미(static변수)  
인스턴스 매서드는 객체 생성후 래퍼런스를 통해서만 호출 가능  

++)  
static은 변수앞에도 붙지만 메서드 앞에도 붙는다

메서드는 클래스의 변수들을 공유한다고 했는데 static변수와 아닌 변수는 메모리가 다르다

일반 static없는 메서드는 new하지 않으면 호출할수 없는 함수이다

왜 ? new함수를 통해서 변수에 접근하니까

static변수는 밖에서 바꿀수 있지만 static 메서드에서는 static붙어있는 변수만 호출이 가능하다

static 메서드에서는 일반 인스턴스 메서드는 호출할수 없다 당연하다 왜 ? static메서드는 객체 생성없이 호출할수 있는 아이다

일반 메서드는 static 메서드 가져다 쓸 수 있다

클래스도 하나의 자료형이라고 이해하자  
Class 4byte (주소가 할당된다), 자료형이긴하지만 메모리 저장 형태가 다르다  
new Person < - 객체  
붕어빵틀 = 클래스, 붕어빵 = 객체의 관계, 객체를 다른말로 인스턴스라고 하기도 한다  
속성 = 변수, 기능 = 메서드  

##### 연산  
and 연산 특) 앞에가 False면 뒤에까지 읽지 않는다   
or 연산 특) 앞에 True면 뒤에까지 연산하지 않는다  

##### 0113 final 접근제한자 의미  
static이 아닌 final을 쓰는 이유는 생성자에서만 한번 초기화 할 수 있는 권한을 준다는 의미  
객체가 각각의 값으로 초기화해서 상수값으로 가지고 있겠다는 뜻  
처음 실행시 초기화는 되지만 변경하지 않겠다 라는 의미

##### this 의미  
val1=val1; 지역변수에 지역변수를 넣어주는것과 같다. 가장 가까운것만 인식한다. this가 인스턴스 변수라고 구분해준다  
this는 클래스 안에서만 쓴다  

##### 기본생성자 의미(껍데기)  
0으로 초기화하는 기본 생성자를 만들어 주는 의미  
기본생성자. 생성자가 없을때만 자동 생성됨. 생성자가 하나라도 있으면 수동으로 만들어야 함  
거의무조건 만들어야 한다. 아주 중요하다  
생성자도 메서드기때문에 오버로딩이 가능하다  
매개변수가 없이 호출될경우를 대비해서도 필요하다  
기본생성자(껍데기만 있는) 자동으로 컴파일시 생성된다  

##### 메서드 오버로딩
메서드 오버로딩 (시험문제 나온다 / 틀린거 찾는걸로)  
동일한 이름의 메서드가 존재할수 있으나 매개변수의 종류나 타입이 달라야 한다   
동일한 클래스에 동일한 이름의 메소드가 여러개 올 수 있다  
  
단, 파라미터의 <타입 또는 갯수>가 달라야 한다  
메서드의 리턴타입은 오버로딩 성립에 영향을 미치지 않는다  
  
Java만이 아닌 모든 객체지향의 특징이다  
아까 생성자도 메서드라고 했기때문에 오버로딩이 가능하다  
