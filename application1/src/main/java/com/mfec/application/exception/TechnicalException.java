package com.mfec.application.exception;

public class TechnicalException extends CommonException {

	private static final long serialVersionUID = 1L;

	public TechnicalException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechnicalException(String errorCode, String message) {
		super(errorCode, message);
		// TODO Auto-generated constructor stub
	}

	public TechnicalException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TechnicalException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public TechnicalException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	

}
