package com.tech.card.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class CustomerDTO {

	@JsonProperty("customer-id")
	private Integer customerId;

	@JsonProperty("customer-name")
	private String name;

	@JsonProperty("customer-email")
	private String email;

	@JsonProperty("customer-address")
	private String address;

	@JsonProperty("customer-created-date")
	private LocalDate createdDate;

	@JsonProperty("customer-cards")
	private List<CardDTO> cards;

}
