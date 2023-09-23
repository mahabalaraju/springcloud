package com.raj.Service;

import java.util.List;

import com.raj.entity.product;

public interface Service {

	product createProduct(product product);
	product updateProduct(product product);
	List<product> getallproducts();
	product getproductByid(int id);
    void deleteProduct( int id);
}
