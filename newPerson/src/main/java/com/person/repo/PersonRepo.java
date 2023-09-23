package com.person.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.entity.entity;
@Repository
public interface PersonRepo extends JpaRepository<entity, Integer>{

}
