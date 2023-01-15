import acc.Account;
import acc.SpecialAccount;

public class AccountTest2 {
	
	
	public static void main(String[] args) {
//		accs[0] = new Account(101, "홍길도",10000);
//		accs[1] = new SpecialAccount(102, "고길동",20000,"VIP");
		Bank bank = new Bank();
		bank.makeAccount(new Account(101, "홍길도", 10000));
		bank.makeAccount(new SpecialAccount(102, "고길동", 20000, "VIP"));
		bank.makeAccount(new SpecialAccount(103, "김길동", 30000, "Gold"));
//		bank.printAllAccount();
		bank.printSpecialAccount("VIP");
//		bank.printAccount();
	}
}
