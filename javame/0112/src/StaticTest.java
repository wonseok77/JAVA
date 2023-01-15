class Test{
	void tfunc1() {}
	static void tfunc2() {}
}
public class StaticTest {
	public void func1() {}
	public static void func2() {}

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.func1(); // main에 static이 붙어있어서 오류남(객체생성안하고하면), main은 객체생성없이 실행되니까
		func2();
		
		Test test = new Test();
		test.tfunc1();
		Test.tfunc2();
		// 이부분 추가학습 필요

	}

}
