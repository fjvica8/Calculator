package com.calculator.calculator.exception;

public class OperationException extends RuntimeException {

	public OperationException() {
		super();
	}

	public OperationException(String message, Throwable cause) {
		super(message, cause);
	}

	public OperationException(String message) {
		super(message);
	}

	public OperationException(Throwable cause) {
		super(cause);
	}
}
