package com.kr;

import java.util.HashMap;
import com.kr.emp.Employee;
import com.kr.emp.iBusinessTrip;

public class Company {
//	Employee[] emps = new Employee[10];
//	private int count;
	
	HashMap<Integer, Employee> emps = new HashMap<>();
	
	void regEmployee(Employee emp) {
//		emps[count++] = emp;
		emps.put(emp.getId(), emp);
	}
	
	void printAllEmployee() {
//		for(int i = 0; i < count; i++) {
//			System.out.println(emps[i]);
//		}
		
		for(Integer id : emps.keySet()) {
			System.out.println(emps.get(id));
		}
	}
	
	int getTotalPay() {
		int total = 0;
//		for(int i = 0; i < count; i++) {
//			total += emps[i].getPay();
//		}
		
		for(Employee emp : emps.values()) {
			total += emp.getPay();
		}
		
		return total;
	}
	
	public void regBusinessTrip(iBusinessTrip emp, int day) {
		emp.goBusinessTrip(day);
	}
}
