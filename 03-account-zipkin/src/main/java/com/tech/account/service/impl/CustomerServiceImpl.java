package com.tech.account.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tech.account.enums.AccountType;
import com.tech.account.enums.ErrorType;
import com.tech.account.exception.AccountServiceException;
import com.tech.account.model.AccountDTO;
import com.tech.account.model.CustomerDTO;
import com.tech.account.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Override
	public void createCustomer(CustomerDTO customerDTO) {
		logger.info("started creating customer");
		logger.info("completed creating customer");
	}

	@Override
	public void createCustomers(List<CustomerDTO> customerDTOs) {
		logger.info("started creating customers");
		logger.info("completed creating customers");
	}

	@Override
	public CustomerDTO getCustomer(Integer customerId) {
		if (ObjectUtils.isNotEmpty(customerId)) {
			logger.info("started getting customer details for customerId {} ", customerId);
			logger.info("completed getting customer details for customerId {} ", customerId);
			return CustomerDTO.builder().build();
		}
		throw new AccountServiceException(ErrorType.CUSTOMER_ID_CANNOT_NULL);
	}

	@Override
	public List<CustomerDTO> getCustomers() {
		logger.info("started getting customer details");
		List<CustomerDTO> customerDTOs = new ArrayList<>();
		logger.info("completed getting customer details");
		return customerDTOs;
	}

	@Override
	public CustomerDTO getCustomerAccounts(Integer customerId) {
		logger.info("started getting account details for customer id {} ", customerId);
		logger.info("completed getting account details for customer id {} ", customerId);
		return CustomerDTO.builder().build();
	}

}
