import acc.Account;
import acc.SpecialAccount;

public class AccountTest {

	public static void main(String[] args) {
		SpecialAccount sacc = new SpecialAccount(100, "박지수", 10000, "VIP");
		System.out.println(sacc.info());
		
		sacc.deposit(1000);
		System.out.println(sacc.info());
		
		// up-casting : 자식 객체를 부모 타입의 레퍼런스 변수에 담을 수 있음
		// 자식 컴포넌트의 지역 변수, 메서드 접근 불가
		// 최상위 부모 컴포넌트 : Object
		Account acc = new SpecialAccount(101, "고길동", 10000, "Gold");
		
		// down-casting
		SpecialAccount ssacc = (SpecialAccount)acc;
		
		// 다형성
		// up-casting 후 오버라이딩한 메소드 호출 시 자식 메소드 호출
		System.out.println(acc.info());
	}

}
