class Product {
	static int snum; // 자동으로 0으로 초기화. 초기화를 강제로 해야하는 변수는 지역변수
	int serialNum;
	public Product() { // 생성자임
		serialNum = ++snum;
		
	}
	
}


public class StaticTest2 {

	public static void main(String[] args) {
		Product[] pros = new Product[] {new Product(), new Product(), new Product()};
		for (int i=0; i<pros.length; i++) {
			System.out.println(pros[i].serialNum);
			// static변수는 객체들이 같이 활용해야 할 때 쓴다
		}

	}

}
