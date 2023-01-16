package com.kr;

public class Permanent extends Employee {
	int pay;
	
	Permanent(int id, String name, int pay) {
		super(id, name);
		this.pay = pay;
	}

	@Override
	public int getPay() {
		return pay;
	}

}
