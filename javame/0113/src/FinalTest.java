class MyClass2 {
	final int num;
	MyClass2(int num) {
		this.num = num;
	}
	
	void func() {
		// this.num = num;
	}
	
	// static이 아닌 final을 쓰는 이유는
	// 생성자에서만 한번 초기화 할 수 있는 권한을 준다
	// 객체가 각각의 값으로 초기화해서 상수값으로 가지고 있겠다는 뜻
	// 처음 실행시 초기화는 되지만 변경하지 않겠다 라는 의미
	
}
public class FinalTest {

	public static void main(String[] args) {
		int n=10;
		n = 20;
		
		final int m = 20; //변경 불가능 변수
//※ error m = 30; final은 변경이 불가능한 변수

	}

}
