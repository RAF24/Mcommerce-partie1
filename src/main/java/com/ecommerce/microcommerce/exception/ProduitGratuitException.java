package com.ecommerce.microcommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends HttpMessageNotReadableException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProduitGratuitException(String message){
		super(message);
	}

}
