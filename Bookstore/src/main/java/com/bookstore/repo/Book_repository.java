package com.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.Entity.book;
@Repository
public interface Book_repository extends JpaRepository<book, Integer> {

}
