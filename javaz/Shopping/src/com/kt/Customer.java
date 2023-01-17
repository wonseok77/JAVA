package com.kt;

import com.kt.entity.Computer;
import com.kt.entity.Product;
import com.kt.entity.Refrigerator;
import com.kt.entity.TV;

public class Customer implements ICustomer{
	private int money;
	private Product[] basket = new Product[5];
	private int count;
	
	public Customer() {}
	public Customer(int money) {
		this.money = money;
	}
	
	public void addProduct(Product product) {
		if(money < product.getPrice()) {
			System.out.println("잔액이 부족하여 " + product.getName() + " 제품을 구매할 수 없습니다.");
			return;
		}
		
		// basket이 꽉 찼을 경우 바구니 큰 것으로 교환
		// basket 배열 동적 생성
		if(basket.length <= count) {
			Product[] newBasket = new Product[basket.length * 2];
			
			// 원래 바구니 정보 복사해서 새로운 바구니에 넣기
			System.arraycopy(basket, 0, newBasket, 0, basket.length);
			basket = newBasket;
		}
		
		basket[count++] = product;
		money -= product.getPrice();
		
		System.out.println(product.getName() + "제품을 구매했습니다. 잔액 : " + money + "원");
	}
	
	public void printBasket() {
		// 구매 목록과 잔액을 출력
		// Computer : 1개
		// TV : 2개
		// 사용금액 : 5000원
		// 잔액 : 5000원
		int tvCount = 0, comCount = 0, refCount = 0, totamt = 0;
		
		for(int i = 0; i < count; i++) {
			totamt += basket[i].getPrice();
			
			if(basket[i] instanceof TV) {
				tvCount++;
			}
			else if(basket[i] instanceof Computer) {
				comCount++;
			}
			else if(basket[i] instanceof Refrigerator) {
				refCount++;
			}
		}
		
		System.out.println("[구매내역 및 잔액]");
		if(comCount > 0) 
			System.out.printf("Computer : %d개\n", comCount);
		if(tvCount > 0)
			System.out.printf("TV : %d개\n", tvCount);
		if(refCount > 0) 
			System.out.printf("Refrigerator : %d개\n", refCount);
		System.out.printf("사용금액 : %d원\n", totamt);
		System.out.printf("잔액 : %d원\n", money);
	}
	
	public void saleProductList(Product[] proList) {
		System.out.println("[판매 제품목록 및 가격]");
		
		for(int i = 0; i < proList.length; i++) {
			System.out.println(proList[i].getName() + "\t" + proList[i].getPrice() + "원");
		}
		System.out.println("---------------------------------------");
		System.out.println("잔액 : " + money + "원");
	}
}
