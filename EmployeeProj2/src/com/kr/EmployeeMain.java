package com.kr;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Company com = new Company();
		
		com.regEmployee(new Permanent(101, "홍길동", 100000));
		com.regEmployee(new Sales(102, "김길동", 80000, 50000));
		com.regEmployee(new PartTime(103, "고길동", 1000, 160));
		com.printAllEmployee();
		System.out.println("총 급여: " + com.getTotalPay());
	}

}

// 출력
// 사번: 101, 이름: 홍길동, 급여: 100000
// 사번: 102, 이름: 김길동, 급여: 130000
// 사번: 103, 이름: 고길동, 급여: 160000
// 총 급여: 390000