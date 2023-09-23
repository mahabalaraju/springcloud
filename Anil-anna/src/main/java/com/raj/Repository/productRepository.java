package com.raj.Repository;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.entity.product;
@Repository
public interface productRepository extends JpaRepository<product, Integer>{
public List<product> findByCreated_at(Instant created_at);
public List<product> findByName(String name);
public List<product> findByPrice(BigDecimal price);
}
