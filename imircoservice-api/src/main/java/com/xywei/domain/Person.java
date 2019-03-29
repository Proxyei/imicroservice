package com.xywei.domain;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -6748468330361752092L;

	private Long id;
	private String personName;
	private String dbSource;

	public Person() {
	}

	public Person(Long id, String personName, String dbSource) {
		this.id = id;
		this.personName = personName;
		this.dbSource = dbSource;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getDbSource() {
		return dbSource;
	}

	public void setDbSource(String dbSource) {
		this.dbSource = dbSource;
	}

}
