package com.tech.card.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {

	@JsonProperty("error-code")
	private String code;

	@JsonProperty("error-message")
	private String message;

}
