package com.kr;

public class Company {
	Employee[] emps = new Employee[10];
	int count;
	
	void regEmployee(Employee emp) {
		emps[count++] = emp;
	}
	
	void printAllEmployee() {
		for(int i = 0; i < count; i++) {
			System.out.println(emps[i]);
		}
	}
	
	int getTotalPay() {
		int total = 0;
		for(int i = 0; i < count; i++) {
			total += emps[i].getPay();
		}
		
		return total;
	}
}
