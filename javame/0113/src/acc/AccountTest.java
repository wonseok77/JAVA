package acc;
import acc.SpecialAccount;
public class AccountTest {

	public static void main(String[] args) {
		
		SpecialAccount sacc = new SpecialAccount(100, "홍길동", 10000, "VIP");
		System.out.println(sacc.info());
		sacc.deposit(1000);
		System.out.println(sacc.info());
		
		
		//upcasting : 자식객체를 부모타입의 래퍼런스 변수에 담을 수 있다.
		Account acc = new SpecialAccount(100, "고길동", 10000, "Gold");
		//downcasting
		SpecialAccount ssacc = (SpecialAccount) acc;
	
		
		// 다형성
		// 부모에도 있고 자식에도 있는 메소드를 부모의 타입으로 호출시 
		// 자식 메서드 호출
		acc.info(); 
		
		
	}

}
