package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.service.CustomerSearchService;

import java.util.List;
@RestController
public class CustomerSearchController {
		@Autowired
		private CustomerSearchService service;
		
		@GetMapping("/customers")
		public List<Customer> getAllPlayers() {
			// TODO Auto-generated method stub
			return service.getAllCustomers();
		}

		@GetMapping("/customers/firstname/{name}")
		public List<Customer> getPlayersByName(@PathVariable String name) {
			// TODO Auto-generated method stub
			return service.getCustomerByName(name);
		}

		@GetMapping("/customers/city/{city}")
		public List<Customer> getPlayersByCity(@PathVariable String city) {
			// TODO Auto-generated method stub
			return service.getCustomerByCity(city);
		}

	}


