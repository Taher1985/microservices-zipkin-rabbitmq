package com.tech.account.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tech.account.enums.ErrorType;
import com.tech.account.model.ErrorDTO;

@ControllerAdvice
public class AccountServiceExceptionHandler {

	@ExceptionHandler(AccountServiceException.class)
	public ResponseEntity<ErrorDTO> accountServiceException(AccountServiceException exception) {
		ErrorDTO errorDTO = ErrorDTO.builder().code(exception.getErrorType().getCode())
				.message(exception.getErrorType().getMessage()).build();
		return new ResponseEntity<>(errorDTO, exception.getErrorType().getHttpStatus());
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDTO> genericException(Exception exception) {
		ErrorDTO errorDTO = ErrorDTO.builder().code(ErrorType.INTERNAL_SERVER_ERROR.getCode())
				.message(ErrorType.INTERNAL_SERVER_ERROR.getMessage()).build();
		return new ResponseEntity<>(errorDTO, ErrorType.INTERNAL_SERVER_ERROR.getHttpStatus());
	}

}
