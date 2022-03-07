package com.calculator.calculator.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	protected ResponseEntity<Object> restExceptions(MethodArgumentTypeMismatchException ex, WebRequest request) {
		String messageError = "Arguments are incorrects.";
		return handleExceptionInternal(ex, messageError, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
}
