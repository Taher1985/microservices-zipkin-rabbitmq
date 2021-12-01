package com.tech.card.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.card.model.CustomerDTO;
import com.tech.card.service.CustomerService;

@RestController
@RequestMapping("/v1")
public class CustomerController {

	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("/card/customer/{customer-id}")
	public ResponseEntity<CustomerDTO> getCustomer(@PathVariable(name = "customer-id") Integer customerId) {
		CustomerDTO customer = customerService.getCustomer(customerId);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@GetMapping("/card/customer")
	public ResponseEntity<List<CustomerDTO>> getCustomers() {
		List<CustomerDTO> customers = customerService.getCustomers();
		return new ResponseEntity<>(customers, HttpStatus.OK);
	}

	@PostMapping("/card/customer")
	public ResponseEntity<Void> createCustomer(@RequestBody CustomerDTO customerDTO) {
		customerService.createCustomer(customerDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PostMapping("/card/customer/bulk")
	public ResponseEntity<Void> createCustomers(@RequestBody List<CustomerDTO> customerDTOs) {
		customerService.createCustomers(customerDTOs);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/card/customer/{customer-id}/card")
	public ResponseEntity<CustomerDTO> getCustomerCards(@PathVariable(name = "customer-id") Integer customerId) {
		CustomerDTO customerCards = customerService.getCustomerCards(customerId);
		return new ResponseEntity<>(customerCards, HttpStatus.OK);
	}

}
