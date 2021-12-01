package com.tech.card.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tech.card.enums.ErrorType;
import com.tech.card.model.ErrorDTO;

@ControllerAdvice
public class CardServiceExceptionHandler {

	@ExceptionHandler(CardServiceException.class)
	public ResponseEntity<ErrorDTO> cardServiceException(CardServiceException exception) {
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
