package EmployeePractice;

abstract public class Employee {
	int id;
	String name;
	
	public Employee() {}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	abstract int getPay() ;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사번 : " + id + ", 이름 : " + name;
	}
	

}
