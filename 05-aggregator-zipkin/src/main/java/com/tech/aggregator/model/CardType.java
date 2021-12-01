package com.tech.aggregator.model;

import lombok.Getter;

@Getter
public enum CardType {

	DEBIT("Debit"), CREDIT("Credit"), AMEX("Amex");

	private String type;

	private CardType(String type) {
		this.type = type;
	}

}
