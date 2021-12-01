package com.tech.aggregator.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tech.aggregator.fiegnclient.AccountFeignClient;
import com.tech.aggregator.fiegnclient.CardFeignClient;
import com.tech.aggregator.model.AccountDTO;
import com.tech.aggregator.model.CardDTO;
import com.tech.aggregator.model.CustomerDTO;

@Service
public class AggregatorService {

	private static final Logger logger = LoggerFactory.getLogger(AggregatorService.class);

	@Autowired
	private AccountFeignClient accountFeignClient;

	@Autowired
	private CardFeignClient cardFeignClient;

	public CustomerDTO getCustomerDetails(@PathVariable(name = "customer-d") Integer customerId) {
		logger.info("started getting customer details for account and cards for customer-id {} ", customerId);
		List<AccountDTO> accountsForCustomer = accountFeignClient.getCustomerAccountDetails(customerId).getAccounts();
		List<CardDTO> cardsForCustomer = cardFeignClient.getCustomerCardDetails(customerId).getCards();
		CustomerDTO customerDTO = mapper(accountsForCustomer, cardsForCustomer, customerId);
		logger.info("completed getting customer details for account and cards for customer-id {} ", customerId);
		return customerDTO;
	}

	private CustomerDTO mapper(List<AccountDTO> accountDTOs, List<CardDTO> cardsDTOs, Integer customerId) {
		return CustomerDTO.builder().customerId(customerId).accounts(accountDTOs).cards(cardsDTOs).build();
	}

}
