class Base {
	private int pv = 1;
	protected int rv = 2;
	int dv=3; // default
	public int bv = 4;
	void func() {
		pv=10;
		rv=20;
		dv=30;
		bv=40;
	}
}

class Derived extends Base {
	void funct() {
		//pv=10; // 부모의 private 변수 접근 불가능
		rv=20;
		dv=30;
		bv=40;
	}

}

public class AccessTest1 {
	public static void main(String[] args) {
		Base b = new Base();
		//b.pv = 100; //private 변수 접근불가능
		Derived d = new Derived();
		//d.pv = 100; //private 변수 접근불가능
		d.rv=200; //경우에 따라 가능, 같은패키지에 있을 경우 접근 가능
		d.dv=300; //경우에 따라 가능, 같은패키지에 있을 경우 접근 가능
		d.bv=400;
	}
}

// 시험 이차원 배열 나온다
// 생성자 생김새 클래스명과 같다 메서드랑 비슷하게 생겼지만. 리턴타입이 없다 근데 void 쓰면 안된다. 쓰는순간 일반 메서드가 된다.
// 99% 생성자는 public이여야 한다. 접근제어자는 써줘야한다. 100% public이여야 하는건 아니다.
// private default protected 다 가능하다 private은 언제 쓸까요 ?
// 외부에서 생성 못한다. 생성자가 private이면 그 클래스를 밖에서 new 할수없다 그럼 왜쓰냐? single tone 내부에서 참조해서 쓰겠단 이야기
//


















