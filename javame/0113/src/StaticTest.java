class TempClass {
	int value; // instance value
	static int svalue;  //class value(static value)
	//프로그램이 시작되면 class는 메서드 에어리어에 로드된다 그 시점에 그 안에있는 static변수는 메서드 에어리어중에
	// tempclass 영역에 메모리가 할당된다
	
	void func() { // instance 메서드에서는 클래스내 모든 변수 함수 접근 가능
		value = 10;
		svalue = 20;
		sfunc();
	}
	
	void func2() {
		func(); // 클래스 안에서 메서드들끼리 호출가능하다. 변수도 서로 호출 가능하다.ㄴ
	}
	
	static void sfunc() {
		//value = 1; new 해야만하는 변수이기 때문에 이렇게 호출 불가능 (static 메서드에서는 instance 변수를 접근할수 없다)
		//func(); (static method에서는 instance 메서드 호출 불가능)
		svalue = 2;
		sfunc2();
	}
	
	static void sfunc2() {
		
	}
	
}

public class StaticTest {

	public static void main(String[] args) {
		TempClass.svalue = 100; // class 이름을 통해 객체 생성 없이도 접근 가능
		System.out.println(TempClass.svalue);
		
		TempClass.sfunc(); // static method 역시 객체 생성 없이 클래스명으로 호출 가능
		
//		TempClass.value = 200; 인스턴스 변수는 바로 이렇게하면 에러남(클래스를 생성한 다음에 클래스의 주소를 담은 래퍼런스를 이용해 접근)
		
		TempClass tc = new TempClass(); //Heap영역에 Tempclass 할당 tc는 메서드 안에있는 지역변수라서 stack에 담겨져 있다
		tc.value = 200; //객체 생성후 레퍼런스 변수를 통해서만 접근 가능
		System.out.println(tc.value);
		System.out.println(tc.svalue); //이것도 가능은 하다(물리적으로 같은 변수) static변수는 클래스명이랑 래퍼런스 둘다 접근 가능
		// 생성된 객체 사이에 공유하라는 의미(static변수)
		
		tc.func(); // 인스턴스 매서드는 객체 생성후 래퍼런스를 통해서만 호출 가능
	}

}
