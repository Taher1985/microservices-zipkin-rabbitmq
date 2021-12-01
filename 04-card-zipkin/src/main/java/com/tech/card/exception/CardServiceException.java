package com.tech.card.exception;

import com.tech.card.enums.ErrorType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CardServiceException extends RuntimeException {

	private final ErrorType errorType;
	private final String message;

	public CardServiceException(ErrorType errorType) {
		super();
		this.errorType = errorType;
		this.message = errorType.getMessage();
	}

}
