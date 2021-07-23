package com.example.dbaccess.exception;

public class ConnectionFactoryException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ConnectionFactoryException() {
		super();
	}

	public ConnectionFactoryException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ConnectionFactoryException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConnectionFactoryException(String message) {
		super(message);
	}

	public ConnectionFactoryException(Throwable cause) {
		super(cause);
	}

}
