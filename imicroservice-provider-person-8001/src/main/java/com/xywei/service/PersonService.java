package com.xywei.service;

import java.util.List;

import com.xywei.domain.Person;

public interface PersonService {

	boolean addPerson(Person person);

	Person findByID(Long id);

	List<Person> findAllPerson();
}
