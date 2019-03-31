package com.xywei.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.xywei.domain.Person;

@RestController
public class ConsumerAppController80 {

	private static final String URL_PROVIDER = "http://127.0.0.1:8001";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "consumer/person/add", method = RequestMethod.GET)
	public boolean addPerson(Person person) {
//		Map<String, String> mapPerson = new HashMap<String, String>();
//		mapPerson.put("personName", person.getPersonName());
		return restTemplate.getForObject(URL_PROVIDER + "/add", Boolean.class, person);
//		return restTemplate.postForObject(URL_PROVIDER + "/add", person, Boolean.class, person.getPersonName());
	}

	@SuppressWarnings("unchecked")
	@RequestMapping("/consumer/findAll")
	public List<Person> findAllPersons() {
		return restTemplate.getForObject(URL_PROVIDER + "/findAll", List.class);
	}

	@RequestMapping("consumer/getPerson/{id}")
	public Person findPersonByID(@PathVariable Long id) {
		return restTemplate.getForObject(URL_PROVIDER + "/getPerson/" + id, Person.class);
	}

}
