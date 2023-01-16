package com.kr;

public class PartTime extends Employee {
	int payPerTime, time;
	
	PartTime(int id, String name, int payPerTime, int time) {
		super(id, name);
		this.payPerTime = payPerTime;
		this.time = time;
	}
	
	//추상 메서드 오버라이딩
	@Override
	public int getPay() {
		return payPerTime * time;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", 근무시간 : " + time + ", 시급 : " + payPerTime;
	}
	
	
	
}
