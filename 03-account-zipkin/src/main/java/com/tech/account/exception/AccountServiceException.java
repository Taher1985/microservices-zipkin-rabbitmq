package com.tech.account.exception;

import com.tech.account.enums.ErrorType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountServiceException extends RuntimeException {

	private final ErrorType errorType;
	private final String message;

	public AccountServiceException(ErrorType errorType) {
		super();
		this.errorType = errorType;
		this.message = errorType.getMessage();
	}

}
