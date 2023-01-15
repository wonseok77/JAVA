
public class OperTet1 {

	public static void main(String[] args) {
//		int n = 10, m = 10;
//		int bn = ++n;
//		int am = m++; 
//		System.out.println(bn);
//		System.out.println(am);
//		// int 오버플로우 범위 알아두기
		
// and 연산 특) 앞에가 False면 뒤에까지 읽지 않는다
// or 연산 특) 앞에 True면 뒤에까지 연산하지 않는다
		
		int a = 10, b = 5;
		if(a > b || ++b == 6) {
			
		}
		System.out.println(b);
		
		int t = 100;
		t *= 3+5; // t = t * (3 + 5) 연산자 우선순위 주의
		System.out.println(t); //syso
// 삼항연산자 성능은 좋으나 가독성은 떨어지니까 깊히 들어갈때 사용을 권장하지 않음 (2~3회 중첩)
		

		}
}
