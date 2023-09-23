package com.raj.Service;

import java.util.List;

import com.raj.entity.product;

public interface productService {

	public String createProduct(product product);
	public String updateProduct(product product);
	public List<product> getallproducts();
	public product getproductByid(int id);
    public String deleteProduct( int id);
    public List<product> getlistofproductsbyname(String name);
    
}
