
public class TryCatchTest {

	public static void main(String[] args) {
		int[] arr1 = {5, 4, 10, 20, 30};
		int[] arr2 = {1, 2, 0, 5};
		
//		for(int i = 0; i < arr1.length; i++) {
//			try {
//				System.out.println(arr1[i] / arr2[i]);
//			}
//			catch(ArithmeticException ae) {
//				System.out.println(0);
//			}
//			catch(ArrayIndexOutOfBoundsException ie) {
//				System.out.println(0);
//			}
//		}
		
		try {
			// error 발생시 for문 탈출
			for(int i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i] / arr2[i]);
			}
		}
		catch(ArithmeticException e) {
			System.out.println(0);
		}
	}

}
