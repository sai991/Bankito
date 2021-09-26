package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.model.Transactions;
import com.app.service.TransactionsService;

@RestController
@CrossOrigin
public class TransactionController {
	
	

		@Autowired
		private TransactionsService service;
		

		@GetMapping("/deposite")
		public long amountDeposite(@RequestBody Transactions transaction) {
           int c=0;
           long amount=0;
           c=transaction.getCustomerId();amount=transaction.getTransactionAmount();
         
           
			return service.depositeAmount(c,amount);
		}

		@GetMapping("/withdraw")
		public long amountWithdrawal(@RequestBody Transactions transaction) {
			  int c=0;
	           long amount=0;
	           c=transaction.getCustomerId();amount=transaction.getTransactionAmount();
			return service.withdrawAmount(c,amount);
		}
		@GetMapping("/transactions/{customerId}")
		public List<Transactions> getAllTransactions(@PathVariable int customerId) {
			 
			return service.allTransactions(customerId);
		}
}
