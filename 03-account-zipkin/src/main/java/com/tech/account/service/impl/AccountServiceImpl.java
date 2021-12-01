package com.tech.account.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tech.account.model.AccountDTO;
import com.tech.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

	@Override
	public void createAccount(AccountDTO accountDTO) {
		logger.info("started creating account");

		logger.info("completed creating account");
	}

	@Override
	public void createAccounts(List<AccountDTO> accountDTOs) {
			logger.info("started creating accounts");
			logger.info("completed creating account");
	}

	@Override
	public AccountDTO getAccount(String accountNumber) {
			logger.info("started getting account details for accountNumber {} ", accountNumber);
			logger.info("completed getting account details for accountNumber {} ", accountNumber);
			return AccountDTO.builder().build();
	}

	@Override
	public List<AccountDTO> getAccounts() {
		logger.info("started getting account details");
		List<AccountDTO> accountDTOs = new ArrayList<>();
		logger.info("completed getting account details");
		return accountDTOs;
	}

	@Override
	public void createAccountForCustomer(Integer customerId, AccountDTO accountDTO) {
			logger.info("started getting customer details for customerId {} ", customerId);
			logger.info("completed getting customer details for customerId {} ", customerId);
			logger.info("started creating account for customerId {} ", customerId);
			logger.info("completed creating account for customerId {} ", customerId);

	}

}
