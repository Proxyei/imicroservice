package com.xywei.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.xywei.domain.Person;

@RestController
public class ConsumerAppController80 {

	private static final String url = "localhost:8001";
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value="consumer/person/add")
	public boolean addPersion(Person person){
		
		return true;
	}

}
