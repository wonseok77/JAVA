package com.kr;

public class PartTime extends Employee {
	int payPerTime, time;
	
	PartTime(int id, String name, int payPerTime, int time) {
		super(id, name);
		this.payPerTime = payPerTime;
		this.time = time;
	}

	@Override
	public int getPay() {
		return payPerTime * time;
	}
	
}
