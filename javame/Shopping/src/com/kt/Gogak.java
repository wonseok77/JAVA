package com.kt;

import com.kt.entity.Computer;
import com.kt.entity.Product;
import com.kt.entity.Refrigerator;
import com.kt.entity.TV;

public class Gogak {
	//왜 private로 하는가
	//배열 왜 Product에서 가져오지
	private int money;
	private Product[] basket = new Product[5];
	private int count;
	public Gogak(int money) {
		this.money = money;
	}
	
	public void saleProductList(Product[] proList) {
		System.out.println("[제품목록 및 가격]");
		for(int i=0; i<proList.length; i++) {
			System.out.println(proList[i].getName()+"\t"+proList[i].getName()+"원");
		}
		System.out.println("-------------------");
		System.out.println("잔액:"+money+"원");
		
	}
	
	public void addProduct(Product product) {
		if(money<product.getPrice()) {
			System.out.println("잔액이 부족하여 " + product.getName()+"구매할 수 없습니다.");
			return ;
		}
		
		//바구니가 꽉 찻을 경우 바구니 큰 걸로 교환
		if(basket.length<=count) {
			Product[] newBasket = new Product[basket.length * 2];
			System.arraycopy(product, 0, newBasket, 0, basket.length);
			basket = newBasket;
		}
		
		basket[count++] = product;
		money -= product.getPrice();
		
		System.out.println(product.getName()+"제품을 구매했습니다.잔액" + money + "원");
	}
	
	public void printBasket() {
		int totamt=0, tvcnt=0, comcnt=0, refcnt=0;
		for(int i=0; i<count; i++) {
			totamt += basket[i].getPrice();
			if(basket[i] instanceof TV) {
				tvcnt++;
			} else if(basket[i] instanceof Computer) {
				comcnt++;
			} else if(basket[i] instanceof Refrigerator) {
				refcnt++;
			}
		}
		System.out.println("[구매내역 및 잔액]");
		if(comcnt>0) System.out.printf("Computer : %d개\n", comcnt);
		if(tvcnt>0) System.out.printf("TV : %d개\n", tvcnt);
		if(refcnt>0) System.out.printf("Refrigerator : %d개\n", refcnt);
		System.out.printf("사용금액 : %d원\n", totamt);
		System.out.printf("잔액 : %d원\n", money);
		// 구매 목록과 잔액을 출력
		// Computer : 1개
		// TV : 2개
		// 사용금액 : 5000원
		// 잔액 : 5000원
	}
}
