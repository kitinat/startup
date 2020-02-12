package com.mfec.application.exception;

import java.util.Date;

public class CommonException extends Exception {

	private static final long serialVersionUID = 1L;

	public String errorCode;
	public String message;
	public Date errorDate = new Date(System.currentTimeMillis());
	
	public CommonException() {
		super();
	}
	
	public CommonException(String message, Throwable cause) {
		super(message, cause);
	}
	public CommonException(String message) {
		super(message);
	}
	public CommonException(Throwable cause) {
		super(cause);
	}
	
	public CommonException(String errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
	
	
 
	

	

}