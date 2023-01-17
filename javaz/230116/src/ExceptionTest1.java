
public class ExceptionTest1 {
	static void func() throws Exception{
		try {
			String str = null;
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("1차 처리");
			throw new Exception("다시 생성");
		} catch (Exception e) {
			System.out.println("나머지 처리");
		}
	}
	
	public static void main(String[] args) {
		try {
			func();
		} catch (Exception e) {
			System.out.println("2차 처리");
		}
		System.out.println("종료");
	}

}
