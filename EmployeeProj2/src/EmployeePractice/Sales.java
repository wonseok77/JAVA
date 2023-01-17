package EmployeePractice;

public class Sales extends Permanent {
	int incentive;
	
	public Sales() {}
	public Sales(int id, String name, int pay, int incentive) {
		super(id,name,pay);
		this.incentive = incentive;
	}
	@Override
	int getPay() {
		// TODO Auto-generated method stub
		return incentive + pay;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", 급여 + 인센 : " + getPay();
	}
	
	
	
	

}
