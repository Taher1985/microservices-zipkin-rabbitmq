package com.tech.account.enums;

import lombok.Getter;

@Getter
public enum AccountType {

	SAVING("Saving"), CURRENT("Current"), TRADING("Trading");

	private String type;

	private AccountType(String type) {
		this.type = type;
	}

}
