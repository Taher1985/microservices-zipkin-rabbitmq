package com.tech.card.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tech.card.enums.CardType;
import com.tech.card.enums.ErrorType;
import com.tech.card.exception.CardServiceException;
import com.tech.card.model.CardDTO;
import com.tech.card.service.CardService;

@Service
public class CardServiceImpl implements CardService {

	private static final Logger logger = LoggerFactory.getLogger(CardServiceImpl.class);

	@Override
	public void createCard(CardDTO cardDTO) {
		logger.info("started creating card");
		logger.info("completed creating card");
	}

	@Override
	public void createCards(List<CardDTO> cardDTOs) {
		logger.info("started creating cards");
		logger.info("completed creating cards");
	}

	@Override
	public CardDTO getCard(String cardNumber) {
		logger.info("started getting card details for cardNumber {} ", cardNumber);
		logger.info("completed getting card details for cardNumber {} ", cardNumber);
		return CardDTO.builder().build();
	}

	@Override
	public List<CardDTO> getCards() {
		logger.info("started getting card details");
		List<CardDTO> cardDTOs = new ArrayList<>();
		logger.info("completed getting card details");
		return cardDTOs;
	}

	@Override
	public void createCardForCustomer(Integer customerId, CardDTO cardDTO) {
		logger.info("started getting customer details for customerId {} ", customerId);
		logger.info("completed getting customer details for customerId {} ", customerId);
		logger.info("started creating card for customerId {} ", customerId);
		logger.info("completed creating card for customerId {} ", customerId);

	}

}
