package com.meritamerica.capstonebackend.models.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NegativeAmountException extends Exception{

	public NegativeAmountException(String msg) {
		super(msg);
	}
	
}
