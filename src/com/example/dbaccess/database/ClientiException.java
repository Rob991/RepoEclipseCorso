package com.example.dbaccess.database;

public class ClientiException extends Exception {

	private static final long serialVersionUID = 1L;

	public ClientiException() {
		super();
	}

	public ClientiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ClientiException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClientiException(String message) {
		super(message);
	}

	public ClientiException(Throwable cause) {
		super(cause);
	}

}
