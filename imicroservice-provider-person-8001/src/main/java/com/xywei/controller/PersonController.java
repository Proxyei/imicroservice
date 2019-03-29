package com.xywei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xywei.domain.Person;
import com.xywei.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public boolean addPerson(Person person) {
		return personService.addPerson(person);
	}

	@RequestMapping(value = "getPerson/{id}", method = RequestMethod.GET)
	public Person findByID(@PathVariable Long id) {
		return personService.findByID(id);
	}

	@RequestMapping(value = "findAll", method = RequestMethod.GET)
	public List<Person> findAllPerson() {
		return personService.findAllPerson();
	}
}
