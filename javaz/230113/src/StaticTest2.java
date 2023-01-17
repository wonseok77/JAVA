
public class StaticTest2 {
	
	public static void main(String[] args) {
		Product[] pros = new Product[] {
				new Product(), new Product(), new Product()
		};
		
		for(int i = 0; i < pros.length; i++) {
			System.out.println(pros[i].serialNum);
		}
	}

}

class Product {
	static int snum;
	int serialNum;
	
	public Product() {
		serialNum = ++snum;
	}
}