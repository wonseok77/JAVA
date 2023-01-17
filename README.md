# JAVA
JAVA skill up
##### 0112 메모리와 자료구조

(스택)   
메소드, for , if 안에 선언된것  
차곡차곡 쌓인다. 함수안에 선언된 변수  
메서드는 호출을 통해 실행이 된다. 호출되는 시점에 변수가 생성이 된다. 끝날때 선언된 변수가 없어진다  
ex) main메소드 args, n, d , p  
Stack : 힙을 참조하기 위한 주소를 참조하는 변수를 Stack 영역에 저장
Heap : 진짜 메모리를 저장

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


##### Employee 실습
(Company) Main에서 실행할 메서드 정의  
(EmployeeMain) Main에서는 최상위 class의 메서드 호출 및 실행  
(Employee) 최상위 부모 class에서는 공유할 멤버 정의, 출력 기본형식 정의 toString(), 추상메서드 getPay() 정의 -> class명에 abstract  
(Permanent) extends Employee 상속, 생성자에 pay 추가, 추상메서드 getPay() 오버라이딩(return pay)  
(Sales) extends Permanent 상속, incentive 멤버 추가, getPay() 오버라이딩 (return super.getPay() + incentive)  
(PartTime) extends Employee, 멤버 추가 payPerTime, time, getPay() 오버라이딩 (return payPerTime * time), toString() 오버라이딩    
return(super.toString() + ", 근무시간 : " + time + ", 시급 : " + payPerTime)    

##### 코드 어려웠던점(생소했던 점)  

Employee[] emps = new Employee[10];  
배열이긴 배열인데 클래스를 담는 배열인건가 ? 그러면 배열 한 칸당 클래스 멤버들이 다 할당되는건가 ?  
  
void regEmployee(Employee emp) {  
		emps[count++] = emp;  
	}  
    
  매개변수로 클래스를 받는구나... 자료형이라고 생각하는게 맞겠다  
  com.regEmployee(new Permanent(101, "홍길동", 100000));    
  이런식으로 클래스에 매개변수가 들어간 형태를 reg 메서드에 매개변수로 넣어주는 형태 기억하기   
  
   
void printAllEmployee() {  
		for(int i = 0; i < count; i++) {  
			System.out.println(emps[i]);  
		}  
	}  
  
  클래스가 저장된 배열을 출력하면 각각 regEmployee에 input된 형태로 저장된것을  
  반복문으로 출력해 주는구나  
  
   int getTotalPay() {  
		int total = 0;  
		for(int i = 0; i < count; i++) {  
			total += emps[i].getPay();  
		}  
		return total;  
	}  
    메서드에 type을 지정하는것이 적응이 안되니 익숙해지도록 하자  
    이건 단순 집계연산 형태이니 기억해두고 응용하자  
    
##### 실습 Feedback  
코드가 직관적으로 잘 해석되지 않는 부분을 모아보니까    
대부분 Main에서 실행할 메서드를 만드는 부분과 Main에서 실행하는 부분이었다  
이러한 부분의 기본형을 눈에 익히고 익숙해지도록 노력하자 ! 
    




