package com.raj.Service;

import java.util.List;
import java.util.Optional;

import com.raj.Repository.productRepository;
import com.raj.entity.product;
import com.raj.exception.ResouceNotFoundException;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
@Transactional    
public class serviceImpl implements Service {
private productRepository repo;
	
	@Override
	public product createProduct(product product) {
	return repo.save(product);
	}

	@Override
	public product updateProduct(product product) {
	Optional<product> newproduct= repo.findById( product.getId());
	if(newproduct.isPresent()) {
		product updateproduct= newproduct.get();
	        updateproduct.setId(product.getId());
	        updateproduct.setDescription(product.getDescription());
	        updateproduct.setPrice(product.getPrice());
	  repo.save(updateproduct);
	  return updateproduct;
	}
	else
		throw new ResouceNotFoundException("No product found with given id:" +product.getId());
	}

	@Override
	public List<product> getallproducts() {
		return repo.findAll();
	}

	@Override
	public product getproductByid(int id) {
		Optional<product> obj= repo.findById(id);
		if(obj.isPresent()) {
				 return obj.get();
		}else
			throw new ResouceNotFoundException("No product found with given id:" +id);
	}

	@Override
	public void deleteProduct(int id) {
		Optional<product> obj= repo.findById(id);
		if(obj.isPresent()) {
				 this.repo.delete(obj.get());
		}else
			throw new ResouceNotFoundException("No product found with given id:" +id);
	}}


