
public class StaticTest {

	public static void main(String[] args) {
		TempClass.svalue = 100;			// class 이름을 통해 객체 생성 없이도 접근 가능
		System.out.println(TempClass.svalue);
		
		TempClass.sfunc();				// static method 역시 객체 생성 없이 클래스명으로 호출 가능
		
		TempClass tc = new TempClass();
		tc.value = 200;					// 객체 생성후 레퍼런스 변수를 통해서만 접근 가능
		System.out.println(tc.value);
		System.out.println(tc.svalue);
		
		tc.func();						// instance method는 객체 생성 후 레퍼런스를 통해서만 호출 가능
	}

}

// class는 Method Area에 Load됨
class TempClass {
	int value;			// instance 변수
	static int svalue;	// static 변수
	
	void func() { 
		value = 10;
		svalue = 20;
		sfunc();
	}
	void func2() {
		func();
	}
	
	static void sfunc() {
		// value = 1;		// static method에서는 instance 변수 접근 불가능
		// func();			// static method에서는 instance 메서드 호출 불가능
		svalue = 2;
		sfunc2();
	}
	static void sfunc2() {
		
	}
}