class Test {
	void tfun1() {}
	static void tfunc2() {}
}

public class StaticTest {
	public void func1() {}
	public static void fun2() {}
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.func1();
		fun2();
		
		Test test = new Test();
		test.tfun1();
		
		Test.tfunc2();
	}

}
