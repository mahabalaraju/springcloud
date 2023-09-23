package com.champion.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.champion.person.person;
@Repository
public interface personRepo extends JpaRepository<person, Integer>{

}
