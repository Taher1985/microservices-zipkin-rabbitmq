package com.tech.card.service;

import java.util.List;

import com.tech.card.model.CardDTO;

public interface CardService {

	void createCard(CardDTO cardDTO);

	void createCards(List<CardDTO> cardDTOs);

	CardDTO getCard(String cardNumber);

	List<CardDTO> getCards();

	void createCardForCustomer(Integer customerId, CardDTO cardDTO);

}
