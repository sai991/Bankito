package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.repository.CustomerRepository;
import com.app.service.CustomerCRUDService;

@Service
public class CustomerCRUDServiceImpl implements CustomerCRUDService {
	@Autowired
	private CustomerRepository repository;

	@Override
	public Customer updateCustomer(Customer customer) {

		return repository.save(customer);
	}

	@Override
	public Customer getCustomerById(int customer_id) {

		return repository.findById(customer_id).get();
	}

	@Override
	public void deleteCustomer(int customer_id) {
		repository.deleteById(customer_id);
	}

	@Override
	public Customer addCustomer(Customer customer) {

		return repository.save(customer);
	}

}
