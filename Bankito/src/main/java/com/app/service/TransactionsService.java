package com.app.service;
import java.util.List;

import com.app.model.*;

public interface TransactionsService {
	long depositeAmount(int customerId,long damount);
	 long withdrawAmount(int customerId,long wamount) ;
	 List<Transactions> allTransactions(int customerId);
//	   deposite(custmer_id,amount)
//	   withdraw(customer_id,amount)
	   
}
