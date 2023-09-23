package com.raj.Service;

import java.util.List;

import com.raj.entity.product;

public interface Service1 {

	String createProduct(product product);
	String updateProduct(product product);
	List<product> getallproducts();
	product getproductByid(int id);
    String deleteProduct( int id);
	}
