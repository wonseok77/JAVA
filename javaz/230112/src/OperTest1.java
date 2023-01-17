
public class OperTest1 {

	public static void main(String[] args) {
		 int n = 10, m = 10;
		 int bn = ++n;
		 int am = m++;
		 System.out.println(bn);
		 System.out.println(am);
		 
		 int a = 10, b = 5;
		 if(a < b && ++b == 6) {
			 // and 연산은 앞이 false인 경우 뒤 연산을 하지 않음
			 // or 연산은 앞이 true인 경우 뒤 연산을 하지 않음
		 }
		 System.out.println(b);
		 
		 int t = 100;
		 t *= 3 + 5;	// + 연산자가 *= 연산자보다 우선순위가 높음
		 System.out.println(t);
	}

}
