package com.kr.emp;

public class PartTime extends Employee implements iBusinessTrip{
	private int payPerTime, time;
	
	public PartTime(int id, String name, int payPerTime, int time) {
		super(id, name);
		this.payPerTime = payPerTime;
		this.time = time;
	}

	public int getPayPerTime() {
		return payPerTime;
	}

	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	@Override
	public int getPay() {
		return payPerTime * time;
	}
	
	public String toString() {
		return super.toString() + ", 급여: " + getPay();
	}

	@Override
	public void goBusinessTrip(int day) {
		time += day * 24;
	}
}
