import acc.Account;
import acc.SpecialAccount;

public class Bank {
	Account[] accs = new Account[100];
	int count = 0;
	
	void makeAccount(Account acc) {
		accs[count++] = acc;
	}
	
	void printAllAccount() {
		for(int i=0; i<count; i++) {
			System.out.println(accs[i].info());
		}
		
	}
	void printSpecialAccount() {
		for(int i=0; i<count; i++) {
			if(accs[i] instanceof SpecialAccount) {
				System.out.println(accs[i].info());
			}
		}
	}
	
	void printSpecialAccount(String grade) {
		for(int i=0; i<count; i++) {
			if(accs[i] instanceof SpecialAccount) {
				SpecialAccount ssacc = (SpecialAccount) accs[i];
				if (ssacc.getGrade().equals(grade))
					System.out.println(accs[i].info());
			}
		}
		
	}
	
	
	void printAccount() {
		for(int i=0; i<count; i++) {
			if(!(accs[i] instanceof SpecialAccount)) {
				System.out.println(accs[i].info());
			}
		}
	}
}
