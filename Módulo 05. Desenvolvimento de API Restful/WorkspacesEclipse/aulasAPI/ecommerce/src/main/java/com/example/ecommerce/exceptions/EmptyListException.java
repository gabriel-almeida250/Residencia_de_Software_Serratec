package com.example.ecommerce.exceptions;

public class EmptyListException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8903966439708058038L;

	public EmptyListException(String message) {
		super(message);
	}
}
