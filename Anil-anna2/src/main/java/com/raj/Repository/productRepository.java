package com.raj.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.entity.product;
public interface productRepository extends JpaRepository<product, Integer>{
	public List<product> findByName(String name);
}
