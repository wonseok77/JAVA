package com.kr;

//추상메서드 있으므로 abstract 제한자
abstract public class Employee {
	int id;
	String name;
	
	
	//생성자
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//추상메서드
	abstract int getPay();
	
	
	//toString 메서드인데 최상위 클래스인 Object 클래스에서
	//오버라이딩해서 가져오는 개념
	public String toString() {
		return "사번: " + id + ", 이름: " + name + ", 급여: " + getPay();
	}
}
