
public class FinalTest {

	public static void main(String[] args) {
		int n = 10;
		n = 20;
		
		final int m = 20;	// 변경 불가능 변수
		// m = 30;
	}

}

class MyClass2 {
	final int num;		// final instance 변수의 초기화는 생성자에서 초기화
	MyClass2(int num) {
		this.num = num;
	}
	
	void func() {
		// this.num = num;	// Method에서는 final 초기화 불가능
	}
}
