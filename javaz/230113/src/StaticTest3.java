
public class StaticTest3 {

	public static void main(String[] args) {
		
	}

}

class MyClass3 {
	static int[] narr = new int[10];
	
	// static block - static 변수가 메모리에 로드되면 초기화
	static {
		for(int i = 0; i < narr.length; i++) {
			narr[i] = (int)(Math.random() * 100) + 1;
		}
	}
}