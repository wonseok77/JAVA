import java.util.ArrayList;
import java.util.Iterator;

import acc.Account;
import acc.SpecialAccount;

public class Bank {
//	Account[] accs = new Account[100];
//	int count = 0;
	ArrayList<Account> accs = new ArrayList<>();
	
	// Account만
	void printAccount() {
//		for(int i = 0; i < count; i++) {
//			if(!(accs[i] instanceof SpecialAccount)) {
//				System.out.println(accs[i].info());
//			}
//		}
		
//		for(Account acc : accs) {
//			if(!(acc instanceof SpecialAccount)) {
//				System.out.println(acc.info());
//			}
//		}
		
		Iterator<Account> it = accs.iterator();
		while(it.hasNext()) {
			Account acc = it.next();
			if(!(acc instanceof SpecialAccount)) {
				System.out.println(acc.info());
			}
		}
	}

	// SpecialAccount만
	void printSpecialAccount() {
//		for(int i = 0; i < count; i++) {
//			if(accs[i] instanceof SpecialAccount) {
//				System.out.println(accs[i].info());
//			}
//		}
		
		Iterator<Account> it = accs.iterator();
		while(it.hasNext()) {
			Account acc = it.next();
			if(acc instanceof SpecialAccount) {
				System.out.println(acc.info());
			}
		}
	}
	
	void printSpecialAccount(String grade) {
//		for(int i = 0; i < count; i++) {
//			if(accs[i] instanceof SpecialAccount) {
//				SpecialAccount ssacc = (SpecialAccount)accs[i];
//				
//				if(ssacc.getGrade().equals(grade))
//					System.out.println(accs[i].info());
//			}
//		}
		
		for(Account acc : accs) {
			if(acc instanceof SpecialAccount) {
				SpecialAccount ssacc = (SpecialAccount)acc;
				
				if(ssacc.getGrade().equals(grade))
					System.out.println(acc.info());
			}
		}
	}

	void printAllAccount() {
		for(Account acc : accs) {
			System.out.println(acc.info());
		}
		
//		for(int i = 0; i < count; i++) {
//			System.out.println(accs[i].info());
//		}
	}

	void makeAccount(Account acc) {
//		accs[count++] = acc;
		accs.add(acc);
	}
}
