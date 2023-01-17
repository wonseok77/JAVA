package EmployeePractice;

public class Permanent extends Employee {
	int pay;

public Permanent() {}

public Permanent(int id, String name, int pay) {
	super(id,name);
	this.pay = pay;
}
	@Override
	int getPay() {
		// TODO Auto-generated method stub
		return pay;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", 급여 : " + pay;
	}
	
	

}
