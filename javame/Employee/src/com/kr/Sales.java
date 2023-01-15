package com.kr;

public class Sales extends Permanent {
	int incentive;
	
	Sales(int id, String name, int pay, int incentive){
		super(id, name, pay);
		this.incentive = incentive;
	}
	
	public int getPay() {
		return super.getPay() + incentive;
	}
}
