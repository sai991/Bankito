package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.model.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer>{

}
