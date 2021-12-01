package com.tech.aggregator.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AccountDTO {

	@JsonProperty("account-id")
	private Integer accountId;

	@JsonProperty("account-number")
	private String accountNumber;

	@JsonProperty("account-type")
	private AccountType accountType;

	@JsonProperty("branch-name")
	private String branchName;

	@JsonProperty("account-created-date")
	private LocalDate createdDate;

}
