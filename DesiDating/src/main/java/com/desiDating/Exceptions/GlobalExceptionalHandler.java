package com.desiDating.Exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionalHandler {

	@ExceptionHandler(UserDetailsNotFoundException.class)
	public String resourceNotFoundExceptionHandler(UserDetailsNotFoundException userDetailsNotFoundException) {
		String
		return 
	}

}
