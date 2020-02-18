package com.mfec.ksme.modulename.model.request;

import javax.validation.constraints.NotEmpty;

import com.mfec.ksme.modulename.model.BaseModel;

import lombok.Data;

@Data
public class HelloRequest extends BaseModel {

	private static final long serialVersionUID = 1L;
	private Long id;
	
	@NotEmpty
	private String message;
	
	@NotEmpty
	private String name;

}
