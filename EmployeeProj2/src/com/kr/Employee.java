package com.kr;

abstract public class Employee {
	int id;
	String name;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	abstract int getPay();
	
	public String toString() {
		return "사번: " + id + ", 이름: " + name + ", 급여: " + getPay();
	}
}
