package com.mfec.ksme.modulename.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.mfec.ksme.modulename.model.BaseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_M_HELLO")
public class HelloEntity  extends BaseModel{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String message;
	
	public HelloEntity(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}
	
	
	
}
