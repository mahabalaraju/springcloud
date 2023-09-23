package com.uploaddownload.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uploaddownload.Model.Product;
@Repository
public interface repository extends JpaRepository<Product, Integer>{
 public Optional<Product> findByName(String filename);
}
