package com.example.ecommerce.exceptions;

public class InvalidCpfException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2169749738068740363L;

	public InvalidCpfException(String message) {
		super(message);
	}
}
