package com.tech.card.enums;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public enum ErrorType {

	CARD_NUMBER_NOT_FOUND("C-101", "Card number '%s' not found", HttpStatus.NOT_FOUND),
	CARD_NUMBER_CANNOT_EMPTY_NULL("C-102", "Card number cannot be empty or null", HttpStatus.BAD_REQUEST),
	NO_CARD_NUMBERS_FOUND("C-103", "No card numbers found", HttpStatus.NOT_FOUND),
	CUSTOMER_ID_NOT_FOUND("C-104", "Customer id '%s' not found", HttpStatus.NOT_FOUND),
	CUSTOMER_ID_CANNOT_NULL("C-105", "Customer id cannot be null", HttpStatus.BAD_REQUEST),
	NO_CUSTOMERS_FOUND("C-106", "No customers found", HttpStatus.NOT_FOUND),
	INTERNAL_SERVER_ERROR("C-500", "Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);

	private String code;
	private String message;
	private HttpStatus httpStatus;

	private ErrorType(String code, String message, HttpStatus httpStatus) {
		this.code = code;
		this.message = message;
		this.httpStatus = httpStatus;
	}

}
