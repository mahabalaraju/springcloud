package com.raj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.model.student;

public interface studentRepository extends JpaRepository<student, Long>{

}
