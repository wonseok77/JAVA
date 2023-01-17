import acc.Account;
import acc.SpecialAccount;

public class AccountTest2 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.makeAccount(new Account(101, "홍길동", 10000));
		bank.makeAccount(new SpecialAccount(102, "고길동", 200000, "VIP"));
		bank.makeAccount(new SpecialAccount(103, "김길동", 300000, "Gold"));
//		bank.printAllAccount();
//		bank.printSpecialAccount();
		bank.printSpecialAccount("VIP");
//		bank.printAccount(); 
	}

}
