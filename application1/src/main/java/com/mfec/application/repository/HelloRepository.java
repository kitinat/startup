package com.mfec.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mfec.application.model.HelloEntity;

@Repository
public interface HelloRepository extends JpaRepository<HelloEntity, Long> {
  
	
}
