package EmployeePractice;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com = new Company();
		
		com.regEmployee(new Permanent(101,"홍길동",10000));
		com.regEmployee(new PartTime(102,"김길동",128, 11000));
		com.regEmployee(new Sales(103,"오길동",12000,5500));
		
		com.printAllEmployee();
		
		System.out.println("총 급여 : " + com.getTotalPay());

	}

}
