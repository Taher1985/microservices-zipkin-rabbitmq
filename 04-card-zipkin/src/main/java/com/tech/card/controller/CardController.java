package com.tech.card.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.card.model.CardDTO;
import com.tech.card.service.CardService;

@RestController
@RequestMapping("/v1")
public class CardController {

	private final CardService cardService;

	public CardController(CardService cardService) {
		super();
		this.cardService = cardService;
	}

	@GetMapping("/card/{card-number}")
	public ResponseEntity<CardDTO> getCard(@PathVariable(name = "card-number") String cardNumber,
			@RequestHeader(name = "X-Request-Header-From-Gateway", required = false) String gatewayHeader,
			@RequestHeader(name = "request-trace-id", required = false) String requestTraceId) {
		CardDTO card = cardService.getCard(cardNumber);
		return new ResponseEntity<>(card, HttpStatus.OK);
	}

	@GetMapping("/card")
	public ResponseEntity<List<CardDTO>> getCards(
			@RequestHeader(name = "X-Request-Header-From-Gateway", required = false) String gatewayHeader,
			@RequestHeader(name = "request-trace-id", required = false) String requestTraceId) {
		List<CardDTO> cards = cardService.getCards();
		return new ResponseEntity<>(cards, HttpStatus.OK);
	}

	@PostMapping("/card")
	public ResponseEntity<Void> createCard(@RequestBody CardDTO cardDTO,
			@RequestHeader(name = "X-Request-Header-From-Gateway", required = false) String gatewayHeader,
			@RequestHeader(name = "request-trace-id", required = false) String requestTraceId) {
		cardService.createCard(cardDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PostMapping("/card/bulk")
	public ResponseEntity<Void> createCards(@RequestBody List<CardDTO> cardDTOs,
			@RequestHeader(name = "X-Request-Header-From-Gateway", required = false) String gatewayHeader,
			@RequestHeader(name = "request-trace-id", required = false) String requestTraceId) {
		cardService.createCards(cardDTOs);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PostMapping("/card/customer/{customer-id}")
	public ResponseEntity<Void> createCardForCustomer(@PathVariable(name = "customer-id") Integer customerId,
			@RequestBody CardDTO cardDTO,
			@RequestHeader(name = "X-Request-Header-From-Gateway", required = false) String gatewayHeader,
			@RequestHeader(name = "request-trace-id", required = false) String requestTraceId) {
		cardService.createCardForCustomer(customerId, cardDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
