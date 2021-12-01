package com.tech.aggregator.fiegnclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tech.aggregator.model.CustomerDTO;

@FeignClient(name = "account-zipkin"  )
public interface AccountFeignClient {

	@GetMapping(path = "/v1/account/customer/{customer-id}/account", consumes = "application/json")
	CustomerDTO getCustomerAccountDetails(@PathVariable(name = "customer-id") Integer customerId);
}
