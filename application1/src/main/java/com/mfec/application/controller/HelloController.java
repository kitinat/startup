package com.mfec.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfec.application.exception.BusinessException;
import com.mfec.application.exception.CommonException;
import com.mfec.application.model.HelloEntity;
import com.mfec.application.model.HelloRequest;
import com.mfec.application.service.HelloService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {

	@Autowired
	private HttpHeaders responseHeader;
	
	@Autowired
	private HelloService service;
	
	@Autowired
	private Environment environment;

	@GetMapping("/")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<String>("Hello " + environment.getProperty("spring.application.name") , responseHeader, HttpStatus.OK);
	}

	@GetMapping("/commonException")
	public ResponseEntity<String> commonException() throws CommonException {
		throw new CommonException("0000", "Handle Common Exception");

	}

	@GetMapping("/businessException")
	public ResponseEntity<String> businessException() throws CommonException {
		throw new BusinessException("0001", "Handle Business Exception");

	}

	@PostMapping("/createHello")
	public ResponseEntity<?> createHello(@RequestBody HelloRequest input) throws CommonException {
		log.info("request body = {}", input);
		HelloEntity output = service.create(input);
		return new ResponseEntity<HelloEntity>(output,responseHeader, HttpStatus.OK);
		
	}
	
	@PostMapping("/saveHello")
	public ResponseEntity<?> saveHello(@RequestBody HelloRequest input) throws CommonException {
		log.info("request body = {}", input);
		HelloEntity output = service.save(input);
		return new ResponseEntity<HelloEntity>(output,responseHeader, HttpStatus.OK);
		
	}
	
	@PostMapping("/deleteHello")
	public ResponseEntity<?> deleteHello(@RequestBody HelloRequest input) throws CommonException {
		log.info("request body = {}", input);
		service.delete(input);
		return new ResponseEntity<HelloEntity>(responseHeader, HttpStatus.OK);
		
	}
}
