package com.bookstore.repo;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.Entity.mybooks;
@Repository
public interface mybookrepo extends JpaRepository<mybooks, Integer> {

}
