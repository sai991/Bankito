package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.model.Transactions;
import com.app.repository.CustomerRepository;
import com.app.service.TransactionsService;


	@Service
	public class TransactionsServiceImpl implements TransactionsService{
		@Autowired
		private CustomerRepository repository;

		@Override
		public long depositeAmount(int customerId,long damount) {
			Customer c=new Customer();
			c=repository.findById(customerId).get();
			long upba=c.getCustomerBalance() + damount;
			c.setCustomerBalance(upba);
			repository.save(c);
			return c.getCustomerBalance();
		}

		@Override
		public long withdrawAmount(int customerId,long wamount) {
			Customer c=new Customer();
			c=repository.findById(customerId).get();
			if(wamount <= c.getCustomerBalance()) {
			c.setCustomerBalance(c.getCustomerBalance() - wamount);
			repository.save(c);
			
		}
			return c.getCustomerBalance();
		}

		@Override
		public List<Transactions> allTransactions(int customerId) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

