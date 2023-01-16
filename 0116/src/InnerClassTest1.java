class Temp {
	int num = 10;
	static int snum=20;
	class Temp2{
		int numt2 = num;
		//가능 Temp2가 생성되어있을때 Temp가 먼저 생성되기 때문에
		
		
	}
	
	static class Temp3{
//		int numt3 = num; 
							// 불가능 static class에서 outer class 변수 사용 못함
		int snumt3 = snum; // static변수끼리는 가능(선언없이도 호출할수 있기 때문에)
	}
	
	void method1() {
		// Temp2 class 생성
		Temp2 temp2 = new Temp2();
		// Temp가 생성되고 호출되어서 temp 따로 생성 안해도 된다
		
		// Temp3 class 생성
		Temp3 temp3 = new Temp3();
	}
	
	static void method2() {
		// Temp2 class 생성
		Temp temp = new Temp();
		Temp2 temp2 = temp.new Temp2();
		// 전역이라 Temp2를 불러오려면 Temp를 먼저 생성하고 호출해야한다
		
		// Temp3 class 생성
		Temp3 temp3 = new Temp3();
	}
	
	void method3(int n) {
		int iv=0;
		final int LV = 0;
		final int N=n;
		class Temp4{
			int numt4 = iv; // 이렇게쓰면안된다 class호출시점에 사라지기 때문에
			int cnumt4 = LV; // final은 상수이기때문에 살아있음
			int cnumt5=N;
			void tmethod() {
				System.out.println(N);
			}
			
		}
	}
}


public class InnerClassTest1 {

	public static void main(String[] args) {
		// Temp2 class 생성
		Temp temp = new Temp();
		Temp.Temp2 temp2 = temp.new Temp2();
		
		// Temp3 class 생성
		Temp.Temp3 temp3 = new Temp.Temp3();
	}

}
