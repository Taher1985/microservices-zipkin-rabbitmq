package com.tech.aggregator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.aggregator.model.CustomerDTO;
import com.tech.aggregator.service.AggregatorService;

@RestController
@RequestMapping("/v1")
public class AggregatorController {

	private final AggregatorService aggregatorService;

	public AggregatorController(AggregatorService aggregatorService) {
		super();
		this.aggregatorService = aggregatorService;
	}

	@GetMapping("/customer/{customer-id}")
	public ResponseEntity<CustomerDTO> getCustomerDetails(@PathVariable(name = "customer-id") Integer customerId,
			@RequestHeader(name = "request-trace-id", required = false) String requestTraceId) {
		return new ResponseEntity<>(aggregatorService.getCustomerDetails(customerId), HttpStatus.OK);
	}

}
