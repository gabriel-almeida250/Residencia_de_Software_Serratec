package com.example.ecommerce.exceptions;

public class InvalidEmailException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8386659215119687102L;

	public InvalidEmailException(String message) {
		super(message);
	}
}
