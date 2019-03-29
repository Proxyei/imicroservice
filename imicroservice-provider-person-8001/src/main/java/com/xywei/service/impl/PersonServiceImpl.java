package com.xywei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xywei.dao.PersonDao;
import com.xywei.domain.Person;
import com.xywei.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	@Override
	public boolean addPerson(Person person) {
		return personDao.addPerson(person);
	}

	@Override
	public Person findByID(Long id) {
		return personDao.findByID(id);
	}

	@Override
	public List<Person> findAllPerson() {
		return personDao.findAllPerson();
	}

}
