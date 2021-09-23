package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.service.CustomerCRUDService;

@RestController
public class CustomerCRUDController {

	@Autowired
	private CustomerCRUDService service;

	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {

		return service.addCustomer(customer);

	}

	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {

		return service.updateCustomer(customer);

	}

	@GetMapping("/customer/{customer_id}")
	public Customer getCustomerById(@PathVariable int customer_id) {
		return service.getCustomerById(customer_id);
	}

	@DeleteMapping("/customer/{customer_id}")
	public void deleteCustomer(@PathVariable int customer_id) {

		service.deleteCustomer(customer_id);
	}

}
