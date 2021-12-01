package com.tech.card.service;

import java.util.List;

import com.tech.card.model.CustomerDTO;

public interface CustomerService {

	void createCustomer(CustomerDTO customerDTO);

	void createCustomers(List<CustomerDTO> customerDTOs);

	CustomerDTO getCustomer(Integer customerId);

	List<CustomerDTO> getCustomers();

	CustomerDTO getCustomerCards(Integer customerId);

}
