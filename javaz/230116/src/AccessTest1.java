class Base {
	private int pv = 1;
	protected int rv = 2;
	int dv = 3;
	public int bv = 4;
	
	void func() {
		pv = 10;
		rv = 20;
		dv = 30;
		bv = 40;
	}
}

class Derived extends Base {
	void method() {
		// pv = 10; // private은 동일 클래스 내에서 가능
		rv = 20;	// protected 동일 패키지나 파생클래스에서 가능
		dv = 30;	// default 동일 패키지에서 가능
		bv = 40;
	}
}

public class AccessTest1 {

	public static void main(String[] args) {
		Base b = new Base();
		// b.pv = 100;		// private 변수 접근 불가능
		Derived d = new Derived();
		// d.pv = 100; 		// private 변수 접근 불가능
		d.rv = 200;			// protected 변수 같은 패키지 안에서 가능
		d.dv = 300;			// default 변수 같은 패키지 안에서 가능
		d.bv = 400;			// 
	}

}
