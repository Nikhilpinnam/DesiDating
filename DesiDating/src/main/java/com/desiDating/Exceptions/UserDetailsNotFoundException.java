package com.desiDating.Exceptions;

public class UserDetailsNotFoundException extends Exception {

	private String message;

	public UserDetailsNotFoundException(String message) {
		super();
		this.message = message;
	}

  }
