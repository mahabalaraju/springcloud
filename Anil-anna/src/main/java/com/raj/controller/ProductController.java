package com.raj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.raj.Repository.productRepository;
import com.raj.Service.Service1;
import com.raj.Service.ServiceImpl;
import com.raj.entity.product;

@RestController
public class ProductController {

	@Autowired
	private Service1 ser;
	@Autowired
	private productRepository repo;
	
//	@GetMapping("/products")
//	public ResponseEntity<List<product>> getallproducts(){
//		return ResponseEntity.ok(ser.getallproducts());
//	}
	@GetMapping("/products")
	public ResponseEntity<List<product>> getallproducts(){
		return ResponseEntity.ok(repo.findAll());
	}
	@GetMapping("/products/{id}")
	public ResponseEntity<product> getbyid(@PathVariable int  id){
		return ResponseEntity.ok(ser.getproductByid(id));
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<String> updateproducts( @PathVariable int id  ,@RequestBody product product){
		product.setId(id);
		return ResponseEntity.ok().body(this.ser.updateProduct(product));
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<?> deletebyid(@PathVariable int id){
		this.ser.deleteProduct(id);
	return (ResponseEntity<?>) ResponseEntity.ok();
	}
	
	@PostMapping("/products")
	public ResponseEntity<String> save(@RequestBody product product){
		return ResponseEntity.ok(ser.createProduct(product));
	}
	
}








