package acc;

public class SpecialAccount extends Account {
	String grade;
	double rate;

	public SpecialAccount() {
		
	}
	public SpecialAccount(int num, String name, int balance, String grade) {
//		this.num = num;
//		this.name = name;
//		this.balance = balance;
		super(num, name, balance);		// 부모 생성자
		setGrade(grade);
	}
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
		switch(this.grade) {
		case "VIP": 
			rate = 0.04;
			break;
		case "Gold": 
			rate = 0.03;
			break;
		case "Silver": 
			rate = 0.02;
			break;
		case "Normal": 
			rate = 0.01;
			break;
		}
	}

	public double getRate() {
		return rate;
	}
	
	@Override
	public String info() {
		// super - 부모 컴포넌트
		return super.info() + ", 등급: " + grade;
	}
	
	@Override
	public void deposit(int money) {
		super.deposit(money+(int)(money * rate));
	}
}
