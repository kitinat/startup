package com.mfec.ksme.modulename.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mfec.ksme.modulename.entity.HelloEntity;

@Repository
public interface HelloRepository extends JpaRepository<HelloEntity, Long> {
  
	
}
