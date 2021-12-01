package com.tech.aggregator.fiegnclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tech.aggregator.model.CustomerDTO;

@FeignClient(name = "card-zipkin")
public interface CardFeignClient {

	@GetMapping(path = "/v1/card/customer/{customer-id}/card", consumes = "application/json")
	CustomerDTO getCustomerCardDetails(@PathVariable(name = "customer-id") Integer customerId);
}
