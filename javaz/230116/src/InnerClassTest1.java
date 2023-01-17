class Temp {
	int num = 10;
	static int snum = 20;
	class Temp2 {
		int numt2 = num;
		int snumt2 = snum;
	}
	
	static class Temp3 {
		// Temp3 클래스 생성 시 Temp 클래스는 생성되어 있지 않음
		// int numt3 = num;
		int snumt3 = snum;
	}
	
	void method1() {
		// Temp2 class 생성
		Temp2 temp2 = new Temp2();
		
		// Temp3 class 생성
		Temp3 temp3 = new Temp3();
	}
	
	static void method2() {
		// Temp2 class 생성
		Temp temp = new Temp();
		Temp2 temp2 = temp.new Temp2();
		
		// Temp3 class 생성
		Temp3 temp3 = new Temp3();
	}
	
	void method3(int n) {
		int iv = 0;
		final int LV = 0;
		final int N = n;
		class Temp4 {
			// method 안에 inner class 생성 가능
			int numt4 = iv;
			int cnumt4 = LV;
			
			int cn = N;
			void tmethod() {
				System.out.println(cn);
			}
		}
	}
}

public class InnerClassTest1 {

	public static void main(String[] args) {
		// Temp2 class 생성
		// new Temp.Temp2();		// instance inner class는 outer class 객체를 생성해야 생성 가능
		Temp temp = new Temp();
		Temp.Temp2 temp2 = temp.new Temp2();
		
		// Temp3 class 생성
		Temp.Temp3 temp3 = new Temp.Temp3();	// static inner class는 outer class 객체가 생성되지 않아도 생성 가능
	}

}
