class Calculator {
	int val1;
	int val2;
	
	public Calculator(int val1, int val2) {
		// val1=val1; 지역변수에 지역변수를 넣어주는것과 같다. 가장 가까운것만 인식한다. this가 인스턴스 변수라고 구분해준다.
		// this는 클래스 안에서만 쓴다
		this.val1 = val1;
		this.val2= val2;
	}
	
	public Calculator(int val1) {
		this.val1 = val1;
		this.val2 = 0;
	}
	
	public Calculator() {} // 0으로 초기화하는 기본 생성자를 만들어 주는 의미
	//기본생성자. 생성자가 없을때만 자동 생성됨. 생성자가 하나라도 있으면 수동으로 만들어야 함
	//거의무조건 만들어야 한다. 아주 중요하다.
	//생성자도 메서드기때문에 오버로딩이 가능하다
	
	
	//동일한 이름의 메서드가 존재할수 있으나 매개변수의 종류나 타입이 달라야 한다 = 메서드 오버로딩 (시험문제 나온다 / 틀린거 찾는걸로)
	//Method overloading
	//동일한 클래스에 동일한 이름의 메소드가 여러개 올 수 있다.
	//단, 파라미터의 타입 또는 갯수가 달라야 한다. 메서드의 리턴타입은 오버로딩 성립에 영향을 미치지 않는다.
	//Java만이 아닌 모든 객체지향의 특징이다.
	//아까 생성자도 메서드라고 했기때문에 오버로딩이 가능하다.
	//기본생성자(껍데기만 있는) 자동으로 컴파일시 생성된다
	
	int add() {
		return val1 + val2;
	}

	
//	int add(int data1, int data2) {
//		return data1 + data2
//	}
	
	int add(int data1, int data2) {
		return data1 + data2;
	}
	
	double add(double data1, double data2) {
		return data1+data2;
	}
	
	int add(int d1, int d2, int d3) {
		return d1 + d2 + d3;
	}
}
	
	
public class MethodTest1 {

	public static void main(String[] args) {
		Calculator cal = new Calculator(10,20);
		Calculator cal2 = new Calculator(100);
		Calculator cal3 = new Calculator();

		System.out.println(cal.add());
		System.out.println(cal.add(100,200));
		System.out.println(cal.add(100.0, 200.0));
	}

}
