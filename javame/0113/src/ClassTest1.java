import acc.Account;

public class ClassTest1 {
	public static void main(String[] args) {
		Account acc1 = new Account(10001,"홍길동",10000);
		acc1.deposit(1000);
		System.out.println(acc1.info());
		
		
		
		Account acc2 = new Account(10002,"고길동",20000);
		acc2.withdraw(1000);
		System.out.println(acc2.info());
	}

}
