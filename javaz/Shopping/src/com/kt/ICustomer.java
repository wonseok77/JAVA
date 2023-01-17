package com.kt;

import com.kt.entity.Product;

public interface ICustomer {
	void saleProductList(Product[] proList);
	void addProduct(Product product);
	void printBasket();
}
