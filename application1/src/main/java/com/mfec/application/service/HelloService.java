package com.mfec.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfec.application.model.HelloEntity;
import com.mfec.application.model.HelloRequest;
import com.mfec.application.repository.HelloRepository;

@Service
@Transactional
public class HelloService {
    
	@Autowired
	HelloRepository repo;
	
	public HelloEntity findById(Long id) {
		Optional<HelloEntity> option = repo.findById(id);
		return option.get();
	}
	
	public HelloEntity create(HelloRequest input) {
		HelloEntity entity = new HelloEntity(input.getName(),input.getMessage());
		return repo.save(entity);
	}
	
	public HelloEntity save(HelloRequest input) {
		HelloEntity entity = new HelloEntity(input.getId(),input.getName(),input.getMessage());
		return repo.save(entity);
	}
	
	public void delete(HelloRequest input) {
		repo.deleteById(input.getId());
	}

}
