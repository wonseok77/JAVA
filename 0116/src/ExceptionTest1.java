
public class ExceptionTest1 {
	
	static void func() {
		try {
		String str = null;
		System.out.println(str.toString());
	} catch(Exception e) {
		System.out.println("1차 처리");
		throw e;
	}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			func();
		} catch(Exception e) {
			System.out.println("2차 처리");
		}
		System.out.println("종료");
		
	}

}
