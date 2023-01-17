package EmployeePractice;

public class PartTime extends Employee {
	int time;
	int payPertime;
	
	public PartTime() {}
	
	public PartTime(int id, String name, int time, int payPertime) {
		super(id,name);
		this.time = time;
		this.payPertime = payPertime;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", 근무시간 : " + time + ", 시급 : " + payPertime + ", 월급 : " + getPay();
	}

	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return payPertime * time;
	}

}
