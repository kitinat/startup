package com.mfec.application.response;

import java.util.Date;

import lombok.Data;

@Data
public class ErrorResponse {
	private int status;
	private String errorMessage;
	private String errorCode;
	private Date date = new Date(System.currentTimeMillis());;

}
