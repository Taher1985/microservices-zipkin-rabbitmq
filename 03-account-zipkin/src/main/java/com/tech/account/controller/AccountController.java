package com.tech.account.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.account.model.AccountDTO;
import com.tech.account.service.AccountService;

@RestController
@RequestMapping("/v1")
public class AccountController {

	private final AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}

	@GetMapping("/account/{account-number}")
	public ResponseEntity<AccountDTO> getAccount(@PathVariable(name = "account-number") String accountNumber,
			@RequestHeader(name = "X-Request-Header-From-Gateway", required = false) String gatewayHeader,
			@RequestHeader(name = "request-trace-id", required = false) String requestTraceId) {
		AccountDTO account = accountService.getAccount(accountNumber);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}

	@GetMapping("/account")
	public ResponseEntity<List<AccountDTO>> getAccounts(
			@RequestHeader(name = "X-Request-Header-From-Gateway", required = false) String gatewayHeader,
			@RequestHeader(name = "request-trace-id", required = false) String requestTraceId) {
		List<AccountDTO> accounts = accountService.getAccounts();
		return new ResponseEntity<>(accounts, HttpStatus.OK);
	}

	@PostMapping("/account")
	public ResponseEntity<Void> createAccount(@RequestBody AccountDTO accountDTO,
			@RequestHeader(name = "X-Request-Header-From-Gateway", required = false) String gatewayHeader,
			@RequestHeader(name = "request-trace-id", required = false) String requestTraceId) {
		accountService.createAccount(accountDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PostMapping("/account/bulk")
	public ResponseEntity<Void> createAccounts(@RequestBody List<AccountDTO> accountDTOs,
			@RequestHeader(name = "X-Request-Header-From-Gateway", required = false) String gatewayHeader,
			@RequestHeader(name = "request-trace-id", required = false) String requestTraceId) {
		accountService.createAccounts(accountDTOs);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PostMapping("/account/customer/{customer-id}")
	public ResponseEntity<Void> createAccountForCustomer(@PathVariable(name = "customer-id") Integer customerId,
			@RequestBody AccountDTO accountDTO,
			@RequestHeader(name = "X-Request-Header-From-Gateway", required = false) String gatewayHeader,
			@RequestHeader(name = "request-trace-id", required = false) String requestTraceId) {
		accountService.createAccountForCustomer(customerId, accountDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
