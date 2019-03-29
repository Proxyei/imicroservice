package com.xywei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xywei.domain.Person;

@Mapper
public interface PersonDao {

	boolean addPerson(Person person);

	Person findByID(Long id);

	List<Person> findAllPerson();

}
