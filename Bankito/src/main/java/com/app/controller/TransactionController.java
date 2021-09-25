package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

		@PutMapping("/deposite")
		public long amountDeposite(@RequestBody Transactions transaction) {
           int c=0;
           long amount=0;
           c=transaction.getCustomerId();amount=transaction.getTransactionAmount();
         
           
			return service.depositeAmount(c,amount);
		}

		@PutMapping("/withdraw")
		public long amountWithdrawal(@RequestBody Transactions transaction) {
			  int c=0;
	           long amount=0;
	           c=transaction.getCustomerId();amount=transaction.getTransactionAmount();
			return service.withdrawAmount(c,amount);
		}
}
