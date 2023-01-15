package acc;
//extends 상속
public class SpecialAccount extends Account {
	String grade;
	double rate;
	
	public SpecialAccount() {}
	//기본 생성자
	
	public SpecialAccount(int num, String name, int balance, String grade) {
//		this.num = num;
//		this.name = name;
//		this.balance = balance;
		super(num, name, balance);
		//부모 생성자를 호출
		//생략하면 기본 생성자를 호출(껍데기)
		setGrade(grade);
	}
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
		switch(this.grade) {
		case "VIP" : rate=0.04; break;
		case "Gold" : rate=0.03; break;
		case "Silver" : rate=0.02; break;
		case "Normal" : rate=0.01; break;
		}
	}
	
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info() + ", 등급:"+grade;
		// 여기서 super는 부모
		// 재정의
	}

	
	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		super.deposit(money+(int)(money * rate));
	}
	
}
