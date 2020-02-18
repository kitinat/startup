package com.mfec.ksme.modulename.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfec.ksme.modulename.entity.HelloEntity;
import com.mfec.ksme.modulename.model.request.HelloRequest;
import com.mfec.ksme.modulename.repository.HelloRepository;

@Service

public class HelloService {
    
	@Autowired
	HelloRepository repo;
	
	public HelloEntity findById(Long id) {
		Optional<HelloEntity> option = repo.findById(id);
		return option.get();
	}
	@Transactional
	public HelloEntity create(HelloRequest input) {
		HelloEntity entity = new HelloEntity(input.getName(),input.getMessage());
		return repo.save(entity);
	}
	@Transactional
	public HelloEntity save(HelloRequest input) {
		HelloEntity entity = new HelloEntity(input.getId(),input.getName(),input.getMessage());
		return repo.save(entity);
	}
	
	public void delete(HelloRequest input) {
		repo.deleteById(input.getId());
	}

}
