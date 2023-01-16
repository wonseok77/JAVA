package com.kr;

//상속 extends
public class Permanent extends Employee {
	int pay;
	
	//생성자
	Permanent(int id, String name, int pay) {
		super(id, name);
		this.pay = pay;
	}

	//추상 메서드 오버라이딩
	@Override
	public int getPay() {
		return pay;
	}

}
