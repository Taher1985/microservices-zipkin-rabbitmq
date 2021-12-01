package com.tech.account.service;

import java.util.List;

import com.tech.account.model.AccountDTO;

public interface AccountService {

	void createAccount(AccountDTO accountDTO);

	void createAccounts(List<AccountDTO> accountDTOs);

	AccountDTO getAccount(String accountNumber);

	List<AccountDTO> getAccounts();

	void createAccountForCustomer(Integer customerId, AccountDTO accountDTO);

}
