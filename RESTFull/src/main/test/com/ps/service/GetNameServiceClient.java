package com.ps.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ps.controller.dto.Name;

@Service
public class GetNameServiceClient {
	private final RestTemplate restTemplate;
	
	public GetNameServiceClient(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public Name getUserNames(String firstName, String familyName){
		return this.restTemplate.getForObject("/ps/name", Name.class,firstName,familyName);
	}
}
