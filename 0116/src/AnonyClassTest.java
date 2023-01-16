class Number {
	int m = 10;
	void method(int m) {
		return m;
	}
}
public class AnonyClassTest {

	public static void main(String[] args) {
		new Number() {
			Number number = new Number() { //익명클래스. Number:조상클래스
								//즉, Number 클래스로부터 상속받아 n 변수를 추가하고, method 재정의
				
			
			int n = 20;

			@Override
			void method() {
				// TODO Auto-generated method stub
				return super.method()+n;
			}
			};
		System.out.println();
			
		};

	}

}
