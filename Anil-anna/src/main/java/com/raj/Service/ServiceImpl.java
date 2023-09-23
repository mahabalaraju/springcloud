package com.raj.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.Repository.productRepository;
import com.raj.entity.product;
import com.raj.exception.ResouceNotFoundException;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
public class ServiceImpl  implements Service1{

	@Autowired
	private productRepository repo;
	

	@Override
	public String createProduct(product product) {
		repo.save(product);
		return "success";
	}

	@Override
	public String updateProduct(product product) {
		Optional<product> newproduct = repo.findById(product.getId());
		if (newproduct.isPresent()) {
			product updateproduct = newproduct.get();
			updateproduct.setId(product.getId());
			updateproduct.setDescription(product.getDescription());
			updateproduct.setPrice(product.getPrice());
			repo.save(updateproduct);
			return "success";
		} else
			throw new ResouceNotFoundException("No product found with given id:" + product.getId());
	}

	@Override
	public List<product> getallproducts() {
		return repo.findAll();
	}

	@Override
	public product getproductByid(int id) {
		Optional<product> obj = repo.findById(id);
		if (obj.isPresent()) {
			return obj.get();
		} else
			throw new ResouceNotFoundException("No product found with given id:" + id);
	}

	@Override
	public String deleteProduct(int id) {
		Optional<product> obj = repo.findById(id);
		if (obj.isPresent()) {
			this.repo.delete(obj.get());
			return "success";
		} else
			throw new ResouceNotFoundException("No product found with given id:" + id);
	}

	

}


