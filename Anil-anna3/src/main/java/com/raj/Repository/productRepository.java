package com.raj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.entity.product;
@Repository
public interface productRepository extends JpaRepository<product, Integer>{

}
