package com.mfec.application.model;

import lombok.Data;

@Data
public class HelloRequest extends BaseModel {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String message;
	private String name;

}
