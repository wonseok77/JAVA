package acc;

public class Account { //public은 다른 package안에있는 애들도 접근을 허용하겠다는 말이다
	int num;
	String name;
	int balance; // 잔액
	
	public Account() {}
	//생성자 : 메모리 생성 직후에 자동으로 호출된다. 메모리 생성은 new 연산자에 의해 생성된다
	//초기화 하라고 생성자를 만들어 주는 것(객체생성직후에)
	//생성자는 클래스명과 같다
	public Account(int num, String name, int balance) {
		this.num = num;
		this.name = name;
		this.balance = balance;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String info( ) {
		return "번호:"+num+", 이름:"+name+", 잔액:"+balance;
	}
	
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
		}
	}
		
	public void withdraw(int money) {
			if(balance>=money) {
				balance -= money;
			}
	}
}
