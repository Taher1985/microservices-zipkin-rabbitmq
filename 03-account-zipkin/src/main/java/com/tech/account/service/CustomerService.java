package com.tech.account.service;

import java.util.List;

import com.tech.account.model.CustomerDTO;

public interface CustomerService {

	void createCustomer(CustomerDTO customerDTO);

	void createCustomers(List<CustomerDTO> customerDTOs);

	CustomerDTO getCustomer(Integer customerId);

	List<CustomerDTO> getCustomers();

	CustomerDTO getCustomerAccounts(Integer customerId);

}
