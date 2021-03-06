package com.mercadolibre.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mercadolibre.service.ItemServiceConsumer;

@Service
public class ItemServiceConsumerImpl implements ItemServiceConsumer {

	@Value("${callenge-seg.api.base}")
	private String base;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResponseEntity getItems(String id) {
		ResponseEntity<Object> response = restTemplate.getForEntity(base + id, Object.class);
		return response;
	}

}
