package com.tech.aggregator.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CardDTO {

	@JsonProperty("card-id")
	private Integer cardId;

	@JsonProperty("card-number")
	private String cardNumber;

	@JsonProperty("card-type")
	private CardType cardType;

	@JsonProperty("branch-name")
	private String branchName;

	@JsonProperty("card-created-date")
	private LocalDate createdDate;

}
