class Only {
	int n = 10;
	static Only only;
	// SingleTon은 객체 하나만 생성해야하기 함, 생성자를 private으로 선언
	private Only() {}
	
	// getOnlyRef에서 Only 객체 하나만 생성
	public static Only getOnlyRef() {
		if(only == null)
			only = new Only();
		
		return only;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}

public class SingleTonTest {
	private SingleTonTest() {}
	SingleTonTest(int n) {}
	
	public static void main(String[] args) {
		Only o1 = Only.getOnlyRef();
		System.out.println(o1.getN());
		o1.setN(20);
		
		Only o2 = Only.getOnlyRef();
		System.out.println(o2.getN());
		
		SingleTonTest s1 = new SingleTonTest();		// 같은 클래스 안이기 때문에 private 생성자도 생성됨
		SingleTonTest s2 = new SingleTonTest(20);
	}

}
