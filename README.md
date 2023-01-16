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

(메서드 area)
static 전역? 개념 프로그램 시작시 메모리가 할당 아무리 new를 하더라도 생성되지않고 하나의 변수를 공유하는 개념

++)
static은 변수앞에도 붙지만 메서드 앞에도 붙는다

메서드는 클래스의 변수들을 공유한다고 했는데 static변수와 아닌 변수는 메모리가 다르다

일반 static없는 메서드는 new하지 않으면 호출할수 없는 함수이다

왜 ? new함수를 통해서 변수에 접근하니까

static변수는 밖에서 바꿀수 있지만 static 메서드에서는 static붙어있는 변수만 호출이 가능하다

static 메서드에서는 일반 인스턴스 메서드는 호출할수 없다 당연하다 왜 ? static메서드는 객체 생성없이 호출할수 있는 아이다

일반 메서드는 static 메서드 가져다 쓸 수 있다
