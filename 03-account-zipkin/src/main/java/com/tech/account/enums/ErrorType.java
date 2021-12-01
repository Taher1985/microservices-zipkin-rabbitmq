package com.tech.account.enums;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public enum ErrorType {

	ACCOUNT_NUMBER_NOT_FOUND("A-101", "Account number '%s' not found", HttpStatus.NOT_FOUND),
	ACCOUNT_NUMBER_CANNOT_EMPTY_NULL("A-102", "Account number cannot be empty or null", HttpStatus.BAD_REQUEST),
	NO_ACCOUNT_NUMBERS_FOUND("A-103", "No account numbers found", HttpStatus.NOT_FOUND),
	CUSTOMER_ID_NOT_FOUND("A-104", "Customer id '%s' not found", HttpStatus.NOT_FOUND),
	CUSTOMER_ID_CANNOT_NULL("A-105", "Customer id cannot be null", HttpStatus.BAD_REQUEST),
	NO_CUSTOMERS_FOUND("A-106", "No customers found", HttpStatus.NOT_FOUND),
	INTERNAL_SERVER_ERROR("A-500", "Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);

	private String code;
	private String message;
	private HttpStatus httpStatus;

	private ErrorType(String code, String message, HttpStatus httpStatus) {
		this.code = code;
		this.message = message;
		this.httpStatus = httpStatus;
	}

}
