package com.xywei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

	// 服务发现
	@Autowired
	private DiscoveryClient discoveryClient;

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

	@RequestMapping(value = "discoveryService", method = RequestMethod.GET)
	public Object discoveryService() {
		// 微服务总数,与下面的instance是一个意思
		List<String> services = discoveryClient.getServices();
		System.out.println("微服务总数有：" + services);
		// 微服务中的示例：
		List<ServiceInstance> serviceInstances = discoveryClient.getInstances("imicroservice-person");
		for (ServiceInstance instance : serviceInstances) {
			System.out.println("service id = " + instance.getServiceId() + " service host = " + instance.getHost()
					+ " service post = " + instance.getPort() + " URI = " + instance.getUri());

		}

		return this.discoveryClient;
	}

}
