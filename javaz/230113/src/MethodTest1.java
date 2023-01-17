
public class MethodTest1 {

	public static void main(String[] args) {
		Calculator cal = new Calculator(10, 20);
		Calculator cal2 = new Calculator(100);
		Calculator cal3 = new Calculator();
		
		System.out.println(cal.add());
		System.out.println(cal.add(100, 200));
	}

}	

class Calculator {
	int val1;
	int val2;
	
	// 기본 생성자. 생성자가 없을 때만 자동 생성됨. 생성자가 하나라도 있으면 수동으로 만들어야 함.
	public Calculator() {
		
	}
	public Calculator(int val1) {
		this.val1 = val1;
	}
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	/*
	 * Method Overloading
	 * 동일한 클래스에 동일한 이름의 메소드가 여러개 있을 수 있음
	 * 단, 파라미터의 타입 또는 갯수가 달라야 함. 메서드의 리턴타입은 오버로딩 성립에 영향을 미치지 않음.
	 */ 
	
	int add() {
		return val1 + val2;
	}
	int add(int data1, int data2) {
		return data1 + data2;
	}
	double add(double data1, double data2) {
		return data1 + data2;
	}
}
